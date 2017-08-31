/**
 * Created by Josh on 11/29/16.
 */

package josh.myapplication;





import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Results{


    //containted within the Results section of json
    //..................................................

    @SerializedName("bioguide_id")
    @Expose
    private String bioguideId;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("chamber")
    @Expose
    private String chamber;
    @SerializedName("contact_form")
    @Expose
    private Object contactForm;
    @SerializedName("crp_id")
    @Expose
    private String crpId;
    @SerializedName("district")
    @Expose
    private Integer district;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("fec_ids")
    @Expose
    private List<String> fecIds = new ArrayList<String>();
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("govtrack_id")
    @Expose
    private String govtrackId;
    @SerializedName("in_office")
    @Expose
    private Boolean inOffice;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("leadership_role")
    @Expose
    private Object leadershipRole;
    @SerializedName("middle_name")
    @Expose
    private Object middleName;
    @SerializedName("name_suffix")
    @Expose
    private Object nameSuffix;
    @SerializedName("nickname")
    @Expose
    private Object nickname;
    @SerializedName("oc_email")
    @Expose
    private String ocEmail;
    @SerializedName("ocd_id")
    @Expose
    private String ocdId;
    @SerializedName("office")
    @Expose
    private String office;
    @SerializedName("party")
    @Expose
    private String party;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("term_end")
    @Expose
    private String termEnd;
    @SerializedName("term_start")
    @Expose
    private String termStart;
    @SerializedName("thomas_id")
    @Expose
    private String thomasId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("votesmart_id")
    @Expose
    private Integer votesmartId;
    @SerializedName("facebook_id")
    @Expose
    private String facebookId;
    @SerializedName("twitter_id")
    @Expose
    private String twitterId;
    @SerializedName("lis_id")
    @Expose
    private String lisId;
    @SerializedName("senate_class")
    @Expose
    private Integer senateClass;
    @SerializedName("state_rank")
    @Expose
    private String stateRank;

    /**
     *
     * @return
     * The bioguideId
     */
    public String getBioguideId() {
        return bioguideId;
    }

    /**
     *
     * @param bioguideId
     * The bioguide_id
     */
    public void setBioguideId(String bioguideId) {
        this.bioguideId = bioguideId;
    }

    /**
     *
     * @return
     * The birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     *
     * @param birthday
     * The birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     *
     * @return
     * The chamber
     */
    public String getChamber() {
        return chamber;
    }

    /**
     *
     * @param chamber
     * The chamber
     */
    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    /**
     *
     * @return
     * The contactForm
     */
    public Object getContactForm() {
        return contactForm;
    }

    /**
     *
     * @param contactForm
     * The contact_form
     */
    public void setContactForm(Object contactForm) {
        this.contactForm = contactForm;
    }

    /**
     *
     * @return
     * The crpId
     */
    public String getCrpId() {
        return crpId;
    }

    /**
     *
     * @param crpId
     * The crp_id
     */
    public void setCrpId(String crpId) {
        this.crpId = crpId;
    }

    /**
     *
     * @return
     * The district
     */
    public Integer getDistrict() {
        return district;
    }

    /**
     *
     * @param district
     * The district
     */
    public void setDistrict(Integer district) {
        this.district = district;
    }

    /**
     *
     * @return
     * The fax
     */
    public String getFax() {
        return fax;
    }

    /**
     *
     * @param fax
     * The fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     *
     * @return
     * The fecIds
     */
    public List<String> getFecIds() {
        return fecIds;
    }

    /**
     *
     * @param fecIds
     * The fec_ids
     */
    public void setFecIds(List<String> fecIds) {
        this.fecIds = fecIds;
    }

    /**
     *
     * @return
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     * The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     * The govtrackId
     */
    public String getGovtrackId() {
        return govtrackId;
    }

    /**
     *
     * @param govtrackId
     * The govtrack_id
     */
    public void setGovtrackId(String govtrackId) {
        this.govtrackId = govtrackId;
    }

    /**
     *
     * @return
     * The inOffice
     */
    public Boolean getInOffice() {
        return inOffice;
    }

    /**
     *
     * @param inOffice
     * The in_office
     */
    public void setInOffice(Boolean inOffice) {
        this.inOffice = inOffice;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The leadershipRole
     */
    public Object getLeadershipRole() {
        return leadershipRole;
    }

    /**
     *
     * @param leadershipRole
     * The leadership_role
     */
    public void setLeadershipRole(Object leadershipRole) {
        this.leadershipRole = leadershipRole;
    }

    /**
     *
     * @return
     * The middleName
     */
    public Object getMiddleName() {
        return middleName;
    }

    /**
     *
     * @param middleName
     * The middle_name
     */
    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    /**
     *
     * @return
     * The nameSuffix
     */
    public Object getNameSuffix() {
        return nameSuffix;
    }

    /**
     *
     * @param nameSuffix
     * The name_suffix
     */
    public void setNameSuffix(Object nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    /**
     *
     * @return
     * The nickname
     */
    public Object getNickname() {
        return nickname;
    }

    /**
     *
     * @param nickname
     * The nickname
     */
    public void setNickname(Object nickname) {
        this.nickname = nickname;
    }

    /**
     *
     * @return
     * The ocEmail
     */
    public String getOcEmail() {
        return ocEmail;
    }

    /**
     *
     * @param ocEmail
     * The oc_email
     */
    public void setOcEmail(String ocEmail) {
        this.ocEmail = ocEmail;
    }

    /**
     *
     * @return
     * The ocdId
     */
    public String getOcdId() {
        return ocdId;
    }

    /**
     *
     * @param ocdId
     * The ocd_id
     */
    public void setOcdId(String ocdId) {
        this.ocdId = ocdId;
    }

    /**
     *
     * @return
     * The office
     */
    public String getOffice() {
        return office;
    }

    /**
     *
     * @param office
     * The office
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     *
     * @return
     * The party
     */
    public String getParty() {
        return party;
    }

    /**
     *
     * @param party
     * The party
     */
    public void setParty(String party) {
        this.party = party;
    }

    /**
     *
     * @return
     * The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     * The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     * The state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     * The stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     *
     * @param stateName
     * The state_name
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     *
     * @return
     * The termEnd
     */
    public String getTermEnd() {
        return termEnd;
    }

    /**
     *
     * @param termEnd
     * The term_end
     */
    public void setTermEnd(String termEnd) {
        this.termEnd = termEnd;
    }

    /**
     *
     * @return
     * The termStart
     */
    public String getTermStart() {
        return termStart;
    }

    /**
     *
     * @param termStart
     * The term_start
     */
    public void setTermStart(String termStart) {
        this.termStart = termStart;
    }

    /**
     *
     * @return
     * The thomasId
     */
    public String getThomasId() {
        return thomasId;
    }

    /**
     *
     * @param thomasId
     * The thomas_id
     */
    public void setThomasId(String thomasId) {
        this.thomasId = thomasId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     *
     * @param website
     * The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     *
     * @return
     * The votesmartId
     */
    public Integer getVotesmartId() {
        return votesmartId;
    }

    /**
     *
     * @param votesmartId
     * The votesmart_id
     */
    public void setVotesmartId(Integer votesmartId) {
        this.votesmartId = votesmartId;
    }

    /**
     *
     * @return
     * The facebookId
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     *
     * @param facebookId
     * The facebook_id
     */
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    /**
     *
     * @return
     * The twitterId
     */
    public String getTwitterId() {
        return twitterId;
    }

    /**
     *
     * @param twitterId
     * The twitter_id
     */
    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    /**
     *
     * @return
     * The lisId
     */
    public String getLisId() {
        return lisId;
    }

    /**
     *
     * @param lisId
     * The lis_id
     */
    public void setLisId(String lisId) {
        this.lisId = lisId;
    }

    /**
     *
     * @return
     * The senateClass
     */
    public Integer getSenateClass() {
        return senateClass;
    }

    /**
     *
     * @param senateClass
     * The senate_class
     */
    public void setSenateClass(Integer senateClass) {
        this.senateClass = senateClass;
    }

    /**
     *
     * @return
     * The stateRank
     */
    public String getStateRank() {
        return stateRank;
    }

    /**
     *
     * @param stateRank
     * The state_rank
     */
    public void setStateRank(String stateRank) {
        this.stateRank = stateRank;
    }

}
