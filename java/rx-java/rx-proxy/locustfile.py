from locust import HttpLocust, TaskSet, task

class UserBehaviour(TaskSet):
    @task(1)
    def index(l):
        l.client.get("/", verify=False)

    @task(1)
    def pa(l):
        l.client.get("/pa-equipment", verify=False)

class WebsiteUser(HttpLocust):
    task_set = UserBehaviour
    min_wait = 1000
    max_wait = 2000
