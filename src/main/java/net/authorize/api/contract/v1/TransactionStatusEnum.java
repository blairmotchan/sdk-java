//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 05:32:06 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="authorizedPendingCapture"/>
 *     &lt;enumeration value="capturedPendingSettlement"/>
 *     &lt;enumeration value="communicationError"/>
 *     &lt;enumeration value="refundSettledSuccessfully"/>
 *     &lt;enumeration value="refundPendingSettlement"/>
 *     &lt;enumeration value="approvedReview"/>
 *     &lt;enumeration value="declined"/>
 *     &lt;enumeration value="couldNotVoid"/>
 *     &lt;enumeration value="expired"/>
 *     &lt;enumeration value="generalError"/>
 *     &lt;enumeration value="pendingFinalSettlement"/>
 *     &lt;enumeration value="pendingSettlement"/>
 *     &lt;enumeration value="failedReview"/>
 *     &lt;enumeration value="settledSuccessfully"/>
 *     &lt;enumeration value="settlementError"/>
 *     &lt;enumeration value="underReview"/>
 *     &lt;enumeration value="updatingSettlement"/>
 *     &lt;enumeration value="voided"/>
 *     &lt;enumeration value="FDSPendingReview"/>
 *     &lt;enumeration value="FDSAuthorizedPendingReview"/>
 *     &lt;enumeration value="returnedItem"/>
 *     &lt;enumeration value="chargeback"/>
 *     &lt;enumeration value="chargebackReversal"/>
 *     &lt;enumeration value="authorizedPendingRelease"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionStatusEnum")
@XmlEnum
public enum TransactionStatusEnum {

    @XmlEnumValue("authorizedPendingCapture")
    AUTHORIZED_PENDING_CAPTURE("authorizedPendingCapture"),
    @XmlEnumValue("capturedPendingSettlement")
    CAPTURED_PENDING_SETTLEMENT("capturedPendingSettlement"),
    @XmlEnumValue("communicationError")
    COMMUNICATION_ERROR("communicationError"),
    @XmlEnumValue("refundSettledSuccessfully")
    REFUND_SETTLED_SUCCESSFULLY("refundSettledSuccessfully"),
    @XmlEnumValue("refundPendingSettlement")
    REFUND_PENDING_SETTLEMENT("refundPendingSettlement"),
    @XmlEnumValue("approvedReview")
    APPROVED_REVIEW("approvedReview"),
    @XmlEnumValue("declined")
    DECLINED("declined"),
    @XmlEnumValue("couldNotVoid")
    COULD_NOT_VOID("couldNotVoid"),
    @XmlEnumValue("expired")
    EXPIRED("expired"),
    @XmlEnumValue("generalError")
    GENERAL_ERROR("generalError"),
    @XmlEnumValue("pendingFinalSettlement")
    PENDING_FINAL_SETTLEMENT("pendingFinalSettlement"),
    @XmlEnumValue("pendingSettlement")
    PENDING_SETTLEMENT("pendingSettlement"),
    @XmlEnumValue("failedReview")
    FAILED_REVIEW("failedReview"),
    @XmlEnumValue("settledSuccessfully")
    SETTLED_SUCCESSFULLY("settledSuccessfully"),
    @XmlEnumValue("settlementError")
    SETTLEMENT_ERROR("settlementError"),
    @XmlEnumValue("underReview")
    UNDER_REVIEW("underReview"),
    @XmlEnumValue("updatingSettlement")
    UPDATING_SETTLEMENT("updatingSettlement"),
    @XmlEnumValue("voided")
    VOIDED("voided"),
    @XmlEnumValue("FDSPendingReview")
    FDS_PENDING_REVIEW("FDSPendingReview"),
    @XmlEnumValue("FDSAuthorizedPendingReview")
    FDS_AUTHORIZED_PENDING_REVIEW("FDSAuthorizedPendingReview"),
    @XmlEnumValue("returnedItem")
    RETURNED_ITEM("returnedItem"),
    @XmlEnumValue("chargeback")
    CHARGEBACK("chargeback"),
    @XmlEnumValue("chargebackReversal")
    CHARGEBACK_REVERSAL("chargebackReversal"),
    @XmlEnumValue("authorizedPendingRelease")
    AUTHORIZED_PENDING_RELEASE("authorizedPendingRelease");
    private final String value;

    TransactionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatusEnum fromValue(String v) {
        for (TransactionStatusEnum c: TransactionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
