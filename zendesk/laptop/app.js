(function() {
  console.log(this.a);
  return {
    events: {
      'app.activated':'setup',
      'userGetRequest.done': 'showInfo',
      'userGetRequest.fail': 'showError'
    },

    setup: function() {
      var id = this.ticket().requester().id();
      console.log(this.ajax('userGetRequest', id));
    },

    showInfo: function(data) {
      this.formatDates(data);

      if (data.user.organization_id != null) {
        this.ajax('orgGetRequest', data.user.organization_id).then(
          function(org_data) {
            data.user.organization_name = org_data.organization.name;
            this.switchTo('requester', data);
          },
          function() {
            this.showError();
          }
        );
      }

      this.switchTo('requester', data);
    },

    showError: function() {
      this.switchTo('error');
    },

    formatDates: function(data) {
      var cdate = new Date(data.user.created_at);
      var ldate = new Date(data.user.last_login_at);
      data.user.created_at = cdate.toLocaleDateString();
      data.user.last_login_at = ldate.toLocaleString();
      return data;
    },

    requests: {
      userGetRequest: function(id) {
        return {
          url: '/api/v2/users/' + id + '.json',
          type:'GET',
          dataType: 'json'
        };
      },

      orgGetRequest: function(id) {
        return {
          url: '/api/v2/organizations/' + id + '.json',
          type:'GET',
          dataType: 'json'
        };
      }
    }
  };

}());
