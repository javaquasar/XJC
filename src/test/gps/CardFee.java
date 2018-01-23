//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 07:33:04 PM EET 
//


package test.gps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardFeeId",
    "localDate",
    "settlementDate",
    "card",
    "account",
    "txId",
    "txnCode",
    "merchCode",
    "msgSource",
    "feeClass",
    "loadUnloadId",
    "desc",
    "feeAmt",
    "amt",
    "fiid",
    "reasonCode"
})
public class CardFee {

    @XmlElement(name = "CardFeeId")
    @XmlSchemaType(name = "unsignedInt")
    protected long cardFeeId;
    @XmlElement(name = "LocalDate", required = true)
    protected String localDate;
    @XmlElement(name = "SettlementDate", required = true)
    protected String settlementDate;
    @XmlElement(name = "Card", required = true)
    protected Card card;
    @XmlElement(name = "Account", required = true)
    protected Account account;
    @XmlElement(name = "TxId")
    @XmlSchemaType(name = "unsignedInt")
    protected long txId;
    @XmlElement(name = "TxnCode")
    protected TxnCode txnCode;
    @XmlElement(name = "MerchCode")
    protected String merchCode;
    @XmlElementRef(name = "MsgSource", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgSourceCardAuthorisation> msgSource;
    @XmlElement(name = "FeeClass", required = true)
    protected FeeClass feeClass;
    @XmlElementRef(name = "LoadUnloadId", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> loadUnloadId;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElementRef(name = "FeeAmt", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectionAmount> feeAmt;
    @XmlElement(name = "Amt", required = true)
    protected DirectionAmount amt;
    @XmlElementRef(name = "FIID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiid;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    private long id;

    /**
     * Gets the value of the cardFeeId property.
     * 
     */
    public long getCardFeeId() {
        return cardFeeId;
    }

    /**
     * Sets the value of the cardFeeId property.
     * 
     */
    public void setCardFeeId(long value) {
        this.cardFeeId = value;
    }

    /**
     * Gets the value of the localDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDate() {
        return localDate;
    }

    /**
     * Sets the value of the localDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDate(String value) {
        this.localDate = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementDate(String value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     */
    public long getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     */
    public void setTxId(long value) {
        this.txId = value;
    }

    /**
     * Gets the value of the txnCode property.
     * 
     * @return
     *     possible object is
     *     {@link TxnCode }
     *     
     */
    public TxnCode getTxnCode() {
        return txnCode;
    }

    /**
     * Sets the value of the txnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnCode }
     *     
     */
    public void setTxnCode(TxnCode value) {
        this.txnCode = value;
    }

    /**
     * Gets the value of the merchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchCode() {
        return merchCode;
    }

    /**
     * Sets the value of the merchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchCode(String value) {
        this.merchCode = value;
    }

    /**
     * Gets the value of the msgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgSourceCardAuthorisation }{@code >}
     *     
     */
    public JAXBElement<MsgSourceCardAuthorisation> getMsgSource() {
        return msgSource;
    }

    /**
     * Sets the value of the msgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgSourceCardAuthorisation }{@code >}
     *     
     */
    public void setMsgSource(JAXBElement<MsgSourceCardAuthorisation> value) {
        this.msgSource = value;
    }

    /**
     * Gets the value of the feeClass property.
     * 
     * @return
     *     possible object is
     *     {@link FeeClass }
     *     
     */
    public FeeClass getFeeClass() {
        return feeClass;
    }

    /**
     * Sets the value of the feeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeClass }
     *     
     */
    public void setFeeClass(FeeClass value) {
        this.feeClass = value;
    }

    /**
     * Gets the value of the loadUnloadId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLoadUnloadId() {
        return loadUnloadId;
    }

    /**
     * Sets the value of the loadUnloadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLoadUnloadId(JAXBElement<Long> value) {
        this.loadUnloadId = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectionAmount }{@code >}
     *     
     */
    public JAXBElement<DirectionAmount> getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectionAmount }{@code >}
     *     
     */
    public void setFeeAmt(JAXBElement<DirectionAmount> value) {
        this.feeAmt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionAmount }
     *     
     */
    public DirectionAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionAmount }
     *     
     */
    public void setAmt(DirectionAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the fiid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFIID() {
        return fiid;
    }

    /**
     * Sets the value of the fiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFIID(JAXBElement<String> value) {
        this.fiid = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long _id) {
        id = _id;
    }

}
