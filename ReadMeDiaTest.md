********* Diagnostic test************

"/DiagnosticTest/addNewTest": {
            "post": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "addNewTest",
                "operationId": "addNewTestUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "test",
                        "description": "test",
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
        "/DiagnosticTest/getAllTests": {
            "get": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "getAllTest",
                "operationId": "getAllTestUsingGET",
                "produces": [
                    "*/*"
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
        "/DiagnosticTest/getTestById/{diagnosticTestid}": {
            "get": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "getTestById",
                "operationId": "getTestByIdUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "diagnosticTestid",
                        "in": "path",
                        "description": "diagnosticTestid",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
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
        "/DiagnosticTest/getTestofDiagnosticCenter/{centerId}": {
            "get": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "getTestsOfDiagnosticCenter",
                "operationId": "getTestsOfDiagnosticCenterUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "centerId",
                        "in": "path",
                        "description": "centerId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
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
        "/DiagnosticTest/removeTest/{centerId}/{test}": {
            "delete": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "removeTestFromDiagnosticCenter",
                "operationId": "removeTestFromDiagnosticCenterUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "centerId",
                        "in": "path",
                        "description": "centerId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "test",
                        "in": "path",
                        "description": "test",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
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
        "/DiagnosticTest/updateTestDetail": {
            "put": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "updateTestDetail",
                "operationId": "updateTestDetailUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "test",
                        "description": "test",
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