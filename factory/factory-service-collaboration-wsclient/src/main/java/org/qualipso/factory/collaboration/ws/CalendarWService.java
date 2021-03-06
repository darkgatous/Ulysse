package org.qualipso.factory.collaboration.ws;

import java.util.HashMap;

import javax.ejb.Remote;

import org.qualipso.factory.collaboration.ws.beans.CalendarDTO;

/**
 * The Interface CalendarWService.
 */
@Remote
public interface CalendarWService {

    /**
     * Read event.
     * 
     * @param itemId
     *            the item id
     * @param seriesId
     *            the series id
     * @param view
     *            the view
     * 
     * @return the hash map< string, object>
     * 
     * @throws Exception
     *             the exception
     */
    public HashMap<String, Object> readEvent(String itemId, String seriesId,
	    String view) throws Exception;

    /**
     * Creates the event.
     * 
     * @param name
     *            the name
     * @param location
     *            the location
     * @param date
     *            the date
     * @param startTime
     *            the start time
     * @param endTime
     *            the end time
     * @param contactName
     *            the contact name
     * @param contactEmail
     *            the contact email
     * @param contactPhone
     *            the contact phone
     * @param recurrence
     *            the recurrence
     * @param times
     *            the times
     * 
     * @return the hash map< string, object>
     * 
     * @throws Exception
     *             the exception
     */
    public HashMap<String, Object> createEvent(String name, String location,
	    String date, String startTime, String endTime, String contactName,
	    String contactEmail, String contactPhone, String recurrence,
	    long times) throws Exception;

    /**
     * Creates the event.
     * 
     * @param calendarDTO
     *            the calendar dto
     * 
     * @return the hash map< string, object>
     * 
     * @throws Exception
     *             the exception
     */
    public HashMap<String, Object> createEvent(CalendarDTO calendarDTO)
	    throws Exception;

    /**
     * Update event.
     * 
     * @param id
     *            the id
     * @param seriesId
     *            the series id
     * @param name
     *            the name
     * @param location
     *            the location
     * @param date
     *            the date
     * @param startTime
     *            the start time
     * @param endTime
     *            the end time
     * @param contactName
     *            the contact name
     * @param contactEmail
     *            the contact email
     * @param contactPhone
     *            the contact phone
     * 
     * @return the hash map< string, string>
     * 
     * @throws Exception
     *             the exception
     */
    public HashMap<String, String> updateEvent(String itemId, String seriesId,
	    String name, String location, String date, String startTime,
	    String endTime, String contactName, String contactEmail,
	    String contactPhone) throws Exception;

    /**
     * Update recurrence.
     * 
     * @param event
     *            the event
     * @param date
     *            the date
     * @param recurrence
     *            the recurrence
     * @param times
     *            the times
     * 
     * @return the hash map< string, string>
     * 
     * @throws Exception
     *             the exception
     */
    public HashMap<String, String> updateRecurrence(CalendarDTO event,
	    String date, String recurrence, long times) throws Exception;

    /**
     * Delete event.
     * 
     * @param id
     *            the id
     * 
     * @return the hash map< string, string>
     * 
     * @throws Exception
     *             the exception
     */
    public HashMap<String, String> deleteEvent(String itemId) throws Exception;

    /**
     * Atttach document(s) to event.
     * 
     * @param itemId the item id
     * @param seriesId the series id
     * @param modify the modify
     * @param documents the documents
     * 
     * @return the hash map< string, string>
     * 
     * @throws Exception the exception
     */
    public HashMap<String, String> atttachDocumentToEvent(String itemId,
	    String seriesId, String modify, String[] documents)
	    throws Exception;

    /**
     * Atttach forum to event.
     * 
     * @param itemId the item id
     * @param seriesId the series id
     * @param modify the modify
     * @param forumId the forum id
     * 
     * @return the hash map< string, string>
     * 
     * @throws Exception the exception
     */
    public HashMap<String, String> atttachForumToEvent(String itemId,
	    String seriesId, String modify, String forumId) throws Exception;
}
