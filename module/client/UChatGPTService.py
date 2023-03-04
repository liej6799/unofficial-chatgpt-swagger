from uplink.auth import ApiTokenParam, ApiTokenHeader, BearerToken
from module.client.UChatGPTApi import UChatGPTApi
BASE_URL = "https://chatgpt.duti.tech"

class UChatGPTService:
    api = UChatGPTApi(base_url=BASE_URL)

    def __init__(self, token=''):
        bearer_auth = BearerToken(token)
        self.api = UChatGPTApi(base_url=BASE_URL, auth=bearer_auth)

    def getModels(self):
        return self.api.get_models()








