package com.rj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PSSNON.PIHASH_INFO")
public class PiHashInfo  {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


	@Column(name = "PIHASH")
	private String piHash;
	@Column(name = "BILLING_AGREEMENT_ID")
	private String billingAgreementId;
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;
	@Column(name = "EXPIRY_DATE")
	private Date expirydate;
	@Column(name = "INACTIVE_DATE")
	private Date inactiveDate;
	@Column(name = "VALIDATED")
	private String validated;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "PM_ID")
	private String pmId;
	@Column(name = "CLIENT_ID")
	private String clientId;
	@Column(name = "DEFAULT_BILLING")
	private String defaultBilling;
	@Column(name = "NAME")
	private String name;
	
	/**
	 * @return the piHash
	 */
	public String getPiHash() {
		return piHash;
	}

	/**
	 * @param piHash
	 *            the piHash to set
	 */
	public void setPiHash(String piHash) {
		this.piHash = piHash;
	}

	/**
	 * @return the billingAgreementId
	 */
	public String getBillingAgreementId() {
		return billingAgreementId;
	}

	/**
	 * @param billingAgreementId
	 *            the billingAgreementId to set
	 */
	public void setBillingAgreementId(String billingAgreementId) {
		this.billingAgreementId = billingAgreementId;
	}

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate
	 *            the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the expirydate
	 */
	public Date getExpirydate() {
		return expirydate;
	}

	/**
	 * @param expirydate
	 *            the expirydate to set
	 */
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

	/**
	 * @return the inactiveDate
	 */
	public Date getInactiveDate() {
		return inactiveDate;
	}

	/**
	 * @param inactiveDate
	 *            the inactiveDate to set
	 */
	public void setInactiveDate(Date inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	/**
	 * @return the validated
	 */
	public String getValidated() {
		return validated;
	}

	/**
	 * @param validated
	 *            the validated to set
	 */
	public void setValidated(String validated) {
		this.validated = validated;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the pmId
	 */
	public String getPmId() {
		return pmId;
	}

	/**
	 * @param pmId
	 *            the pmId to set
	 */
	public void setPmId(String pmId) {
		this.pmId = pmId;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the defaultBilling
	 */
	public String getDefaultBilling() {
		return defaultBilling;
	}

	/**
	 * @param defaultBilling
	 *            the defaultBilling to set
	 */
	public void setDefaultBilling(String defaultBilling) {
		this.defaultBilling = defaultBilling;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

}
