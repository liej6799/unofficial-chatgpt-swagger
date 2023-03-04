from module.client.UChatGPTService import UChatGPTService
import os
# service = UChatGPTService(token=os.environ["ACCESSTOKEN"]);
service = UChatGPTService(token="awd");
print(service.getModels())