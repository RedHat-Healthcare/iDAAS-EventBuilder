package io.connectedhealth_idaas.eventbuilder.parsers.clinical;

import ca.uhn.fhir.model.dstu2.resource.Questionnaire;
import com.google.gson.Gson;
import io.connectedhealth_idaas.eventbuilder.events.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource.AllergyIntolerance;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource.Note;

import java.util.List;
import java.util.UUID;

public class FHIRStreamParserRoutingEvent {

    public RoutingEvent buildRoutingEvent_AllergyIntollernace (String body){
        RoutingEvent routingEvent = new RoutingEvent();
        Gson gson = new Gson();
        AllergyIntolerance allergy = new AllergyIntolerance();
        UUID uuid = UUID.randomUUID();
        String uuidstr = uuid.toString();
        allergy = gson.fromJson(body, AllergyIntolerance.class);
        String messageTypeData = "AllergyIntolerence";
        String messageSendingDate = allergy.getRecordedDate();
        String messageSendingHour = allergy.getRecordedDate().substring(11, 13);
        String messageTime = allergy.getRecordedDate().substring(11, 19);
        System.out.println(allergy.getRecordedDate());
        System.out.println(messageSendingHour);
        String facilityId = allergy.getId();
        String resourceType = allergy.getResourceType();
        String messageEvent = allergy.getText().getStatus();
        List<Note> obj = allergy.getNote();
        String noteVal = obj.get(0).getText();
        routingEvent.setSendingApp(resourceType);
        routingEvent.setFacilityId(facilityId);
        routingEvent.setIndustryStd("FHIR");
        routingEvent.setMessageDateTime(messageSendingDate);
        routingEvent.setMessageDate(messageSendingDate);
        routingEvent.setMessageHour(messageSendingHour);
        routingEvent.setMessageTime(messageTime);
        routingEvent.setMessageType(resourceType);
        routingEvent.setMessageEvent(messageEvent);
        routingEvent.setMessageId(facilityId);
        routingEvent.setUniqueMessageId(uuidstr);
        routingEvent.setMessageVersion("V1");
        routingEvent.setMessageData(noteVal);

        return routingEvent;
    }
    public RoutingEvent buildRoutingEvent_Questinnaire (String body){
        RoutingEvent routingEvent = new RoutingEvent();
        Gson gson = new Gson();
        //Questionnaire
        AllergyIntolerance allergy = new AllergyIntolerance();
        UUID uuid = UUID.randomUUID();
        String uuidstr = uuid.toString();
        allergy = gson.fromJson(body, AllergyIntolerance.class);
        String messageTypeData = "AllergyIntolerence";
        String messageSendingDate = allergy.getRecordedDate();
        String messageSendingHour = allergy.getRecordedDate().substring(11, 13);
        String messageTime = allergy.getRecordedDate().substring(11, 19);
        System.out.println(allergy.getRecordedDate());
        System.out.println(messageSendingHour);
        String facilityId = allergy.getId();
        String resourceType = allergy.getResourceType();
        String messageEvent = allergy.getText().getStatus();
        List<Note> obj = allergy.getNote();
        String noteVal = obj.get(0).getText();
        routingEvent.setSendingApp(resourceType);
        routingEvent.setFacilityId(facilityId);
        routingEvent.setIndustryStd("FHIR");
        routingEvent.setMessageDateTime(messageSendingDate);
        routingEvent.setMessageDate(messageSendingDate);
        routingEvent.setMessageHour(messageSendingHour);
        routingEvent.setMessageTime(messageTime);
        routingEvent.setMessageType(resourceType);
        routingEvent.setMessageEvent(messageEvent);
        routingEvent.setMessageId(facilityId);
        routingEvent.setUniqueMessageId(uuidstr);
        routingEvent.setMessageVersion("V1");
        routingEvent.setMessageData(noteVal);

        return routingEvent;
    }
}
