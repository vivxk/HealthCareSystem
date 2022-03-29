********* Diagnostic testResult ************
"/TestResult/RemoveTest/{id}": {
            "delete": {
                "tags": [
                    "test-controller"
                ],
                "summary": "removeTest",
                "operationId": "removeTestUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "ts",
                        "in": "path",
                        "description": "ts",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "string"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/TestResult/UpdateTest": {
            "put": {
                "tags": [
                    "test-controller"
                ],
                "summary": "updateTest",
                "operationId": "updateTestUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "ts",
                        "description": "ts",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/TestResult/ViewAllTest": {
            "get": {
                "tags": [
                    "test-controller"
                ],
                "summary": "viewAllTest",
                "operationId": "viewAllTestUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "criteria",
                        "in": "path",
                        "description": "criteria",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/DiagnosticTest"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/TestResult/addTest": {
            "post": {
                "tags": [
                    "test-controller"
                ],
                "summary": "addTest",
                "operationId": "addTestUsingPOST_1",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "ts",
                        "description": "ts",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },