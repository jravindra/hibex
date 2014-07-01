package com.mkyong;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PSSNON.CUST_FUNDING_SRC")
public class CustFundingSource {

    @Id
    private long id;


    /** The pihashinfo set. */
//    @OneToMany
//    @JoinColumn(name = "pihash_info_id")
//    private Set<PiHashInfo> piHashInfos;
    
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "pihash_info_id")
    private PiHashInfo piHashInfo;

    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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


    /**
     * @return the piHashInfo
     */
    public PiHashInfo getPiHashInfo() {
        return piHashInfo;
    }

    /**
     * @param piHashInfo the piHashInfo to set
     */
    public void setPiHashInfo(PiHashInfo piHashInfo) {
        this.piHashInfo = piHashInfo;
    }


    // TODO:ravindra - Add toString

}
