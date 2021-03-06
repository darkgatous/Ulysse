
package ws.factory.qualipso.org.service.voip;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import net.java.dev.jaxb.array.IntArray;
import net.java.dev.jaxb.array.StringArray;
import ws.factory.qualipso.org.resource.conference_detail.ConferenceDetails;
import ws.factory.qualipso.org.resource.conference_detail.ConferenceDetailsArray;
import ws.factory.qualipso.org.resource.participants_info.ParticipantsInfoArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "VoIPConferenceService", targetNamespace = "http://org.qualipso.factory.ws/service/voip")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ws.factory.qualipso.org.resource.participants_info.ObjectFactory.class,
    ws.factory.qualipso.org.resource.link.ObjectFactory.class,
    ws.factory.qualipso.org.resource.file.ObjectFactory.class,
    ws.factory.qualipso.org.resource.conference_detail.ObjectFactory.class,
    net.java.dev.jaxb.array.ObjectFactory.class,
    ws.factory.qualipso.org.service.voip.ObjectFactory.class,
    ws.factory.qualipso.org.resource.folder.ObjectFactory.class,
    ws.factory.qualipso.org.resource.profile.ObjectFactory.class,
    ws.factory.qualipso.org.resource.group.ObjectFactory.class
})
public interface VoIPConferenceService {


    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @param arg7
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String activateVoipProfile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4,
        @WebParam(name = "arg5", partName = "arg5")
        String arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        String arg7)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean addUserToConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean banUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg13
     * @param arg11
     * @param arg12
     * @param arg10
     * @param arg6
     * @param arg7
     * @param arg8
     * @param arg9
     * @return
     *     returns int
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public int createConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        short arg3,
        @WebParam(name = "arg4", partName = "arg4")
        boolean arg4,
        @WebParam(name = "arg5", partName = "arg5")
        String arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        long arg7,
        @WebParam(name = "arg8", partName = "arg8")
        long arg8,
        @WebParam(name = "arg9", partName = "arg9")
        int arg9,
        @WebParam(name = "arg10", partName = "arg10")
        String arg10,
        @WebParam(name = "arg11", partName = "arg11")
        String arg11,
        @WebParam(name = "arg12", partName = "arg12")
        boolean arg12,
        @WebParam(name = "arg13", partName = "arg13")
        String arg13)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg13
     * @param arg11
     * @param arg12
     * @param arg10
     * @param arg6
     * @param arg7
     * @param arg8
     * @param arg9
     * @return
     *     returns int
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public int createConferenceHR(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        short arg3,
        @WebParam(name = "arg4", partName = "arg4")
        boolean arg4,
        @WebParam(name = "arg5", partName = "arg5")
        String arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        String arg7,
        @WebParam(name = "arg8", partName = "arg8")
        String arg8,
        @WebParam(name = "arg9", partName = "arg9")
        int arg9,
        @WebParam(name = "arg10", partName = "arg10")
        String arg10,
        @WebParam(name = "arg11", partName = "arg11")
        String arg11,
        @WebParam(name = "arg12", partName = "arg12")
        boolean arg12,
        @WebParam(name = "arg13", partName = "arg13")
        String arg13)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean deactivateVoipProfile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg13
     * @param arg11
     * @param arg12
     * @param arg10
     * @param arg6
     * @param arg7
     * @param arg8
     * @param arg9
     * @return
     *     returns int
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public int editConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        short arg4,
        @WebParam(name = "arg5", partName = "arg5")
        boolean arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        String arg7,
        @WebParam(name = "arg8", partName = "arg8")
        long arg8,
        @WebParam(name = "arg9", partName = "arg9")
        long arg9,
        @WebParam(name = "arg10", partName = "arg10")
        int arg10,
        @WebParam(name = "arg11", partName = "arg11")
        String arg11,
        @WebParam(name = "arg12", partName = "arg12")
        String arg12,
        @WebParam(name = "arg13", partName = "arg13")
        boolean arg13)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg13
     * @param arg11
     * @param arg12
     * @param arg10
     * @param arg6
     * @param arg7
     * @param arg8
     * @param arg9
     * @return
     *     returns int
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public int editConferenceHR(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        short arg4,
        @WebParam(name = "arg5", partName = "arg5")
        boolean arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        String arg7,
        @WebParam(name = "arg8", partName = "arg8")
        String arg8,
        @WebParam(name = "arg9", partName = "arg9")
        String arg9,
        @WebParam(name = "arg10", partName = "arg10")
        int arg10,
        @WebParam(name = "arg11", partName = "arg11")
        String arg11,
        @WebParam(name = "arg12", partName = "arg12")
        String arg12,
        @WebParam(name = "arg13", partName = "arg13")
        boolean arg13)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean endConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns ws.factory.qualipso.org.service.voip.FactoryResource
     * @throws FactoryException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public FactoryResource findResource(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws FactoryException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getAsteriskVersion()
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns ws.factory.qualipso.org.resource.conference_detail.ConferenceDetails
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public ConferenceDetails getConferenceDetails(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns ws.factory.qualipso.org.resource.conference_detail.ConferenceDetailsArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public ConferenceDetailsArray getConferencesDetailsList(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getJoinDate(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getJoinDateHR(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns ws.factory.qualipso.org.resource.participants_info.ParticipantsInfoArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public ParticipantsInfoArray getParticipantsListHR(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getRecordings(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray getResourceTypeList();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getServiceName();

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getServiceVersion()
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getVoipUsername(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String isDBOpen()
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isPastConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isUserBanned(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isUserMuted(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isUserTalking(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isVoIPProfileExists(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean kickUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray listBannedUsers(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.IntArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public IntArray listConfferences(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.IntArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public IntArray listConfferencesByInvitation(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.IntArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public IntArray listConfferencesByOwner(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray listInvitedUsers(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.IntArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public IntArray listParticipants(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.IntArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public IntArray listPastConfferences(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.IntArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public IntArray listPublicConfferences(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray listUsers(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean lockConf(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String loginStatus(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean muteUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public int removeConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean removeUserFromConference(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean resetDatabase(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean setConferenceUserList(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        StringArray arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean unbanUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean unlockConf(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean unmuteUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3)
        throws VoIPConferenceServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VoIPConferenceServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public String usernameFromQualipsoUsers(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws VoIPConferenceServiceException_Exception
    ;

}
