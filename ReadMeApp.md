 ********* Appointment ************
  "paths": {
        "/Appointment/addTestRes/{AppointmentId}/{testResId}": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "addTestRes",
                "operationId": "addTestResUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "AppointmentId",
                        "in": "path",
                        "description": "AppointmentId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "testResId",
                        "in": "path",
                        "description": "testResId",
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
        "/Appointment/addappointment": {
            "post": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "addAppointment",
                "operationId": "addAppointmentUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    },
                    {
                        "name": "diagnosticCenterID",
                        "in": "query",
                        "description": "diagnosticCenterID",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "patientID",
                        "in": "query",
                        "description": "patientID",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "testIds",
                        "in": "query",
                        "description": "testIds",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/getAll": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "getAll",
                "operationId": "getAllUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/getPatient/{AppointmentId}": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "getPatient",
                "operationId": "getPatientUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "appID",
                        "in": "path",
                        "description": "appID",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/Patient"
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
        "/Appointment/getVerifiable": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "verifiable",
                "operationId": "verifiableUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/getWithNoTestResults": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "noTestResults",
                "operationId": "noTestResultsUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/getappointmentlist": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "getApppointmentList",
                "operationId": "getApppointmentListUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "appointmentStatus",
                        "in": "query",
                        "description": "appointmentStatus",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "diagnosticCenterid",
                        "in": "query",
                        "description": "diagnosticCenterid",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "testName",
                        "in": "query",
                        "description": "testName",
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
                                "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/reject": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "reject",
                "operationId": "rejectUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/removeappointment": {
            "delete": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "removeAppointment",
                "operationId": "removeAppointmentUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/updateappointment": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "updateAppointment",
                "operationId": "updateAppointmentUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    },
                    {
                        "name": "diagnosticCenterID",
                        "in": "query",
                        "description": "diagnosticCenterID",
                        "required": false,
                        "type": "string"
                    },
                    {
                        "name": "patientID",
                        "in": "query",
                        "description": "patientID",
                        "required": false,
                        "type": "string"
                    },
                    {
                        "name": "testIds",
                        "in": "query",
                        "description": "testIds",
                        "required": false,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "testResultId",
                        "in": "query",
                        "description": "testResultId",
                        "required": false,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/verify": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "verify",
                "operationId": "verifyUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/viewappointment/{appointmentId}": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "viewAppointment",
                "operationId": "viewAppointmentUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "appointmentId",
                        "in": "path",
                        "description": "appointmentId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
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
        "/Appointment/viewappointments/{patientId}": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "viewAppointments",
                "operationId": "viewAppointmentsUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "patientId",
                        "in": "path",
                        "description": "patientId",
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
                                "$ref": "#/definitions/AppointmentRes"
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