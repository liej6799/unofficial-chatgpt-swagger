from uplink import Consumer, get, Path, Query, returns

from module.model.error.errorResponse import ErrorResponse
from module.model.model.modelResponse import ModelResponse


class UChatGPTApi(Consumer):
    """A Python Client for the Unoffcial Chat GPT API."""

    @returns.json
    @get("api/models")
    def get_models(self):
        """Retrieves the Chat GPT Models."""