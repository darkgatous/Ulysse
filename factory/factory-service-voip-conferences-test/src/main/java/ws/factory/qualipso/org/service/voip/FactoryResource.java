
package ws.factory.qualipso.org.service.voip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ws.factory.qualipso.org.resource.conference_detail.ConferenceDetails;
import ws.factory.qualipso.org.resource.file.File;
import ws.factory.qualipso.org.resource.folder.Folder;
import ws.factory.qualipso.org.resource.group.Group;
import ws.factory.qualipso.org.resource.link.Link;
import ws.factory.qualipso.org.resource.participants_info.ParticipantsInfo;
import ws.factory.qualipso.org.resource.profile.Profile;


/**
 * <p>Java class for factoryResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="factoryResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factoryResource")
@XmlSeeAlso({
    File.class,
    Group.class,
    Profile.class,
    Link.class,
    ParticipantsInfo.class,
    Folder.class,
    ConferenceDetails.class
})
public abstract class FactoryResource {


}
