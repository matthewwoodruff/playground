import React, { Component } from 'react';

class Filter extends Component {

  constructor(props) {
    super(props);
    this.state = {counter: 0};
    this.handleClick = this.handleClick.bind(this);
  }

  handleClick = (e) => {
    e.preventDefault();
    this.setState(prevState => ({
      counter: prevState.counter + 1
    }));
  }

  render() {
    return (
      <div className="Filter">
        The filter component
        <a href="#" onClick={this.handleClick}> Click Here </a>
        Clicked {this.state.counter} times
      </div>
    );
  }
}

export default Filter;
