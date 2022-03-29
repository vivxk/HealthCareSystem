

create table appointment (appointmentid integer not null, appointment_date date, approval_status varchar(255), diagnostic_center_diagnostic_centerid 
integer, patient_patient_id integer, primary key (appointmentid)) 

create table diagnostic_center (diagnostic_centerid integer not null, address varchar(255), contact_email varchar(255), contact_no varchar(255), name varchar(255), primary key (diagnostic_centerid)) 
 
 create table diagnostic_test (diagnostic_testid integer not null, normal_value varchar(255), test_name varchar(255), test_price double precision not null, units varchar(255), diagnostic_center_diagnostic_centerid integer, primary key (diagnostic_testid)) 

create table patient (patient_id integer not null, age integer not null, gender varchar(255), name varchar(255), phone_no varchar(255), user_userid integer, primary key (patient_id)) engine=InnoDB

create table test_result (test_resultid integer not null, test_name varchar(255), test_reading double precision not null, testcondition varchar(255), appointment_appointmentid integer, primary key (test_resultid)) 

create table user (userid integer not null, is_logged_in boolean default false, password varchar(255), role varchar(255), username varchar(255), primary key (userid)) 

*****************************************************************************************

alter table appointment add constraint FK7tlearjfqr99y3ur4pmsjmdpa foreign key (diagnostic_center_diagnostic_centerid) references diagnostic_center (diagnostic_centerid)

alter table appointment add constraint FK2vlah44v7jbr62swnit3835kr foreign key (patient_patient_id) references patient (patient_id)

alter table appointment_diagnostic_tests add constraint FKtqxhvifpmmd9xpdw7oa7f5tv1 foreign key (diagnostic_tests_diagnostic_testid) references diagnostic_test (diagnostic_testid)

alter table appointment_diagnostic_tests add constraint FKojc2tcbr6vj7ucfsn0d6e7lvg foreign key (appointment_appointmentid) references appointment (appointmentid)

alter table diagnostic_test add constraint FK6q40c7gvkafi8u5djqc71mssn foreign key (diagnostic_center_diagnostic_centerid) references diagnostic_center (diagnostic_centerid)

alter table patient add constraint FK5b8vyapunspxuy8hxgjhag874 foreign key (user_userid) references user (userid)

alter table test_result add constraint FKaym5txrkl0y3xijtcdcnbs2u4 foreign key (appointment_appointmentid) references appointment (appointmentid)

*******************************************************************************************
alter table appointment drop foreign key 

alter table appointment drop foreign key 

alter table appointment_diagnostic_tests drop foreign key 

alter table appointment_diagnostic_tests drop foreign key 

alter table diagnostic_test drop foreign key

********************************************************************************************