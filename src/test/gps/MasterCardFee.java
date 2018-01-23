//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 07:33:04 PM EET 
//


package test.gps;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mastercardFeeId",
    "mtid",
    "functionCode024",
    "conversionRateReconciliation009",
    "additionalData048",
    "localDate",
    "settlementDate",
    "feeClass",
    "desc",
    "feeAmt",
    "amt",
    "reasonCode",
    "dataRecord072",
    "de93TxnDestID",
    "de94TxnOrigID",
    "fileIDPDS0105",
    "fileProcessDate",
    "recon",
    "settlement"
})
public class MasterCardFee {

    @XmlElement(name = "MastercardFeeId")
    @XmlSchemaType(name = "unsignedInt")
    protected long mastercardFeeId;
    @XmlElement(name = "MTID", required = true)
    protected String mtid;
    @XmlElement(name = "Function_Code_024", required = true)
    protected String functionCode024;
    @XmlElement(name = "Conversion_Rate_Reconciliation_009", required = true)
    protected BigDecimal conversionRateReconciliation009;
    @XmlElement(name = "Additional_Data_048", required = true)
    protected String additionalData048;
    @XmlElement(name = "LocalDate", required = true)
    protected String localDate;
    @XmlElement(name = "SettlementDate", required = true)
    protected String settlementDate;
    @XmlElement(name = "FeeClass", required = true)
    protected MasterCardFeeClass feeClass;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "FeeAmt", required = true)
    protected DirectionAmount feeAmt;
    @XmlElement(name = "Amt", required = true)
    protected DirectionAmount amt;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlElement(name = "Data_Record_072", required = true)
    protected String dataRecord072;
    @XmlElement(name = "DE93_Txn_Dest_ID", required = true)
    protected String de93TxnDestID;
    @XmlElement(name = "DE94_Txn_Orig_ID", required = true)
    protected String de94TxnOrigID;
    @XmlElement(name = "File_ID_PDS0105", required = true)
    protected String fileIDPDS0105;
    @XmlElement(name = "FileProcessDate", required = true)
    protected String fileProcessDate;
    @XmlElement(name = "Recon", required = true)
    protected Recon recon;
    @XmlElement(name = "Settlement", required = true)
    protected Settlement settlement;
    private long id;

    /**
     * Gets the value of the mastercardFeeId property.
     * 
     */
    public long getMastercardFeeId() {
        return mastercardFeeId;
    }

    /**
     * Sets the value of the mastercardFeeId property.
     * 
     */
    public void setMastercardFeeId(long value) {
        this.mastercardFeeId = value;
    }

    /**
     * Gets the value of the mtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTID() {
        return mtid;
    }

    /**
     * Sets the value of the mtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTID(String value) {
        this.mtid = value;
    }

    /**
     * Gets the value of the functionCode024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCode024() {
        return functionCode024;
    }

    /**
     * Sets the value of the functionCode024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCode024(String value) {
        this.functionCode024 = value;
    }

    /**
     * Gets the value of the conversionRateReconciliation009 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRateReconciliation009() {
        return conversionRateReconciliation009;
    }

    /**
     * Sets the value of the conversionRateReconciliation009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRateReconciliation009(BigDecimal value) {
        this.conversionRateReconciliation009 = value;
    }

    /**
     * Gets the value of the additionalData048 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData048() {
        return additionalData048;
    }

    /**
     * Sets the value of the additionalData048 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData048(String value) {
        this.additionalData048 = value;
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
     * Gets the value of the feeClass property.
     * 
     * @return
     *     possible object is
     *     {@link MasterCardFeeClass }
     *     
     */
    public MasterCardFeeClass getFeeClass() {
        return feeClass;
    }

    /**
     * Sets the value of the feeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterCardFeeClass }
     *     
     */
    public void setFeeClass(MasterCardFeeClass value) {
        this.feeClass = value;
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
     *     {@link DirectionAmount }
     *     
     */
    public DirectionAmount getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionAmount }
     *     
     */
    public void setFeeAmt(DirectionAmount value) {
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

    /**
     * Gets the value of the dataRecord072 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRecord072() {
        return dataRecord072;
    }

    /**
     * Sets the value of the dataRecord072 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRecord072(String value) {
        this.dataRecord072 = value;
    }

    /**
     * Gets the value of the de93TxnDestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDE93TxnDestID() {
        return de93TxnDestID;
    }

    /**
     * Sets the value of the de93TxnDestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDE93TxnDestID(String value) {
        this.de93TxnDestID = value;
    }

    /**
     * Gets the value of the de94TxnOrigID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDE94TxnOrigID() {
        return de94TxnOrigID;
    }

    /**
     * Sets the value of the de94TxnOrigID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDE94TxnOrigID(String value) {
        this.de94TxnOrigID = value;
    }

    /**
     * Gets the value of the fileIDPDS0105 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileIDPDS0105() {
        return fileIDPDS0105;
    }

    /**
     * Sets the value of the fileIDPDS0105 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileIDPDS0105(String value) {
        this.fileIDPDS0105 = value;
    }

    /**
     * Gets the value of the fileProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileProcessDate() {
        return fileProcessDate;
    }

    /**
     * Sets the value of the fileProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileProcessDate(String value) {
        this.fileProcessDate = value;
    }

    /**
     * Gets the value of the recon property.
     * 
     * @return
     *     possible object is
     *     {@link Recon }
     *     
     */
    public Recon getRecon() {
        return recon;
    }

    /**
     * Sets the value of the recon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recon }
     *     
     */
    public void setRecon(Recon value) {
        this.recon = value;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * @return
     *     possible object is
     *     {@link Settlement }
     *     
     */
    public Settlement getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Settlement }
     *     
     */
    public void setSettlement(Settlement value) {
        this.settlement = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long _id) {
        id = _id;
    }

}