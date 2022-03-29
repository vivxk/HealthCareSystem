 ********* Appointment ************

 "/patient/deletePatient": {
            "delete": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "deletePatient",
                "operationId": "deletePatientUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "patient",
                        "description": "patient",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/PatientReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
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
        "/patient/getAll": {
            "get": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "getAll",
                "operationId": "getAllUsingGET_1",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/PatientRes"
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
        "/patient/registerpatient": {
            "post": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "registerPatient",
                "operationId": "registerPatientUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "patient",
                        "description": "patient",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/PatientReq"
                        }
                    },
                    {
                        "name": "userID",
                        "in": "path",
                        "description": "userID",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
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
        "/patient/updatepatient": {
            "put": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "updatePatientDetails",
                "operationId": "updatePatientDetailsUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "patient",
                        "description": "patient",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/PatientReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
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
        "/patient/viewpatient/{userid}": {
            "get": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "viewPatient",
                "operationId": "viewPatientUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "userid",
                        "in": "path",
                        "description": "userid",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
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
        "/patient/viewtestresult/{testResultId}": {
            "get": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "viewTestResult",
                "operationId": "viewTestResultUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "testResultId",
                        "in": "path",
                        "description": "testResultId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/TestResult"
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