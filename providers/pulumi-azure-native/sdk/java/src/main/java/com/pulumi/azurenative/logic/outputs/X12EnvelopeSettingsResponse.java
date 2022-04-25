// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class X12EnvelopeSettingsResponse {
    /**
     * @return The controls standards id.
     * 
     */
    private final Integer controlStandardsId;
    /**
     * @return The control version number.
     * 
     */
    private final String controlVersionNumber;
    /**
     * @return The value indicating whether to enable default group headers.
     * 
     */
    private final Boolean enableDefaultGroupHeaders;
    /**
     * @return The functional group id.
     * 
     */
    private final @Nullable String functionalGroupId;
    /**
     * @return The group control number lower bound.
     * 
     */
    private final Integer groupControlNumberLowerBound;
    /**
     * @return The group control number upper bound.
     * 
     */
    private final Integer groupControlNumberUpperBound;
    /**
     * @return The group header agency code.
     * 
     */
    private final String groupHeaderAgencyCode;
    /**
     * @return The group header date format.
     * 
     */
    private final String groupHeaderDateFormat;
    /**
     * @return The group header time format.
     * 
     */
    private final String groupHeaderTimeFormat;
    /**
     * @return The group header version.
     * 
     */
    private final String groupHeaderVersion;
    /**
     * @return The interchange  control number lower bound.
     * 
     */
    private final Integer interchangeControlNumberLowerBound;
    /**
     * @return The interchange  control number upper bound.
     * 
     */
    private final Integer interchangeControlNumberUpperBound;
    /**
     * @return The value indicating whether to overwrite existing transaction set control number.
     * 
     */
    private final Boolean overwriteExistingTransactionSetControlNumber;
    /**
     * @return The receiver application id.
     * 
     */
    private final String receiverApplicationId;
    /**
     * @return The value indicating whether to rollover group control number.
     * 
     */
    private final Boolean rolloverGroupControlNumber;
    /**
     * @return The value indicating whether to rollover interchange control number.
     * 
     */
    private final Boolean rolloverInterchangeControlNumber;
    /**
     * @return The value indicating whether to rollover transaction set control number.
     * 
     */
    private final Boolean rolloverTransactionSetControlNumber;
    /**
     * @return The sender application id.
     * 
     */
    private final String senderApplicationId;
    /**
     * @return The transaction set control number lower bound.
     * 
     */
    private final Integer transactionSetControlNumberLowerBound;
    /**
     * @return The transaction set control number prefix.
     * 
     */
    private final @Nullable String transactionSetControlNumberPrefix;
    /**
     * @return The transaction set control number suffix.
     * 
     */
    private final @Nullable String transactionSetControlNumberSuffix;
    /**
     * @return The transaction set control number upper bound.
     * 
     */
    private final Integer transactionSetControlNumberUpperBound;
    /**
     * @return The usage indicator.
     * 
     */
    private final String usageIndicator;
    /**
     * @return The value indicating whether to use control standards id as repetition character.
     * 
     */
    private final Boolean useControlStandardsIdAsRepetitionCharacter;

    @CustomType.Constructor
    private X12EnvelopeSettingsResponse(
        @CustomType.Parameter("controlStandardsId") Integer controlStandardsId,
        @CustomType.Parameter("controlVersionNumber") String controlVersionNumber,
        @CustomType.Parameter("enableDefaultGroupHeaders") Boolean enableDefaultGroupHeaders,
        @CustomType.Parameter("functionalGroupId") @Nullable String functionalGroupId,
        @CustomType.Parameter("groupControlNumberLowerBound") Integer groupControlNumberLowerBound,
        @CustomType.Parameter("groupControlNumberUpperBound") Integer groupControlNumberUpperBound,
        @CustomType.Parameter("groupHeaderAgencyCode") String groupHeaderAgencyCode,
        @CustomType.Parameter("groupHeaderDateFormat") String groupHeaderDateFormat,
        @CustomType.Parameter("groupHeaderTimeFormat") String groupHeaderTimeFormat,
        @CustomType.Parameter("groupHeaderVersion") String groupHeaderVersion,
        @CustomType.Parameter("interchangeControlNumberLowerBound") Integer interchangeControlNumberLowerBound,
        @CustomType.Parameter("interchangeControlNumberUpperBound") Integer interchangeControlNumberUpperBound,
        @CustomType.Parameter("overwriteExistingTransactionSetControlNumber") Boolean overwriteExistingTransactionSetControlNumber,
        @CustomType.Parameter("receiverApplicationId") String receiverApplicationId,
        @CustomType.Parameter("rolloverGroupControlNumber") Boolean rolloverGroupControlNumber,
        @CustomType.Parameter("rolloverInterchangeControlNumber") Boolean rolloverInterchangeControlNumber,
        @CustomType.Parameter("rolloverTransactionSetControlNumber") Boolean rolloverTransactionSetControlNumber,
        @CustomType.Parameter("senderApplicationId") String senderApplicationId,
        @CustomType.Parameter("transactionSetControlNumberLowerBound") Integer transactionSetControlNumberLowerBound,
        @CustomType.Parameter("transactionSetControlNumberPrefix") @Nullable String transactionSetControlNumberPrefix,
        @CustomType.Parameter("transactionSetControlNumberSuffix") @Nullable String transactionSetControlNumberSuffix,
        @CustomType.Parameter("transactionSetControlNumberUpperBound") Integer transactionSetControlNumberUpperBound,
        @CustomType.Parameter("usageIndicator") String usageIndicator,
        @CustomType.Parameter("useControlStandardsIdAsRepetitionCharacter") Boolean useControlStandardsIdAsRepetitionCharacter) {
        this.controlStandardsId = controlStandardsId;
        this.controlVersionNumber = controlVersionNumber;
        this.enableDefaultGroupHeaders = enableDefaultGroupHeaders;
        this.functionalGroupId = functionalGroupId;
        this.groupControlNumberLowerBound = groupControlNumberLowerBound;
        this.groupControlNumberUpperBound = groupControlNumberUpperBound;
        this.groupHeaderAgencyCode = groupHeaderAgencyCode;
        this.groupHeaderDateFormat = groupHeaderDateFormat;
        this.groupHeaderTimeFormat = groupHeaderTimeFormat;
        this.groupHeaderVersion = groupHeaderVersion;
        this.interchangeControlNumberLowerBound = interchangeControlNumberLowerBound;
        this.interchangeControlNumberUpperBound = interchangeControlNumberUpperBound;
        this.overwriteExistingTransactionSetControlNumber = overwriteExistingTransactionSetControlNumber;
        this.receiverApplicationId = receiverApplicationId;
        this.rolloverGroupControlNumber = rolloverGroupControlNumber;
        this.rolloverInterchangeControlNumber = rolloverInterchangeControlNumber;
        this.rolloverTransactionSetControlNumber = rolloverTransactionSetControlNumber;
        this.senderApplicationId = senderApplicationId;
        this.transactionSetControlNumberLowerBound = transactionSetControlNumberLowerBound;
        this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
        this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
        this.transactionSetControlNumberUpperBound = transactionSetControlNumberUpperBound;
        this.usageIndicator = usageIndicator;
        this.useControlStandardsIdAsRepetitionCharacter = useControlStandardsIdAsRepetitionCharacter;
    }

    /**
     * @return The controls standards id.
     * 
     */
    public Integer controlStandardsId() {
        return this.controlStandardsId;
    }
    /**
     * @return The control version number.
     * 
     */
    public String controlVersionNumber() {
        return this.controlVersionNumber;
    }
    /**
     * @return The value indicating whether to enable default group headers.
     * 
     */
    public Boolean enableDefaultGroupHeaders() {
        return this.enableDefaultGroupHeaders;
    }
    /**
     * @return The functional group id.
     * 
     */
    public Optional<String> functionalGroupId() {
        return Optional.ofNullable(this.functionalGroupId);
    }
    /**
     * @return The group control number lower bound.
     * 
     */
    public Integer groupControlNumberLowerBound() {
        return this.groupControlNumberLowerBound;
    }
    /**
     * @return The group control number upper bound.
     * 
     */
    public Integer groupControlNumberUpperBound() {
        return this.groupControlNumberUpperBound;
    }
    /**
     * @return The group header agency code.
     * 
     */
    public String groupHeaderAgencyCode() {
        return this.groupHeaderAgencyCode;
    }
    /**
     * @return The group header date format.
     * 
     */
    public String groupHeaderDateFormat() {
        return this.groupHeaderDateFormat;
    }
    /**
     * @return The group header time format.
     * 
     */
    public String groupHeaderTimeFormat() {
        return this.groupHeaderTimeFormat;
    }
    /**
     * @return The group header version.
     * 
     */
    public String groupHeaderVersion() {
        return this.groupHeaderVersion;
    }
    /**
     * @return The interchange  control number lower bound.
     * 
     */
    public Integer interchangeControlNumberLowerBound() {
        return this.interchangeControlNumberLowerBound;
    }
    /**
     * @return The interchange  control number upper bound.
     * 
     */
    public Integer interchangeControlNumberUpperBound() {
        return this.interchangeControlNumberUpperBound;
    }
    /**
     * @return The value indicating whether to overwrite existing transaction set control number.
     * 
     */
    public Boolean overwriteExistingTransactionSetControlNumber() {
        return this.overwriteExistingTransactionSetControlNumber;
    }
    /**
     * @return The receiver application id.
     * 
     */
    public String receiverApplicationId() {
        return this.receiverApplicationId;
    }
    /**
     * @return The value indicating whether to rollover group control number.
     * 
     */
    public Boolean rolloverGroupControlNumber() {
        return this.rolloverGroupControlNumber;
    }
    /**
     * @return The value indicating whether to rollover interchange control number.
     * 
     */
    public Boolean rolloverInterchangeControlNumber() {
        return this.rolloverInterchangeControlNumber;
    }
    /**
     * @return The value indicating whether to rollover transaction set control number.
     * 
     */
    public Boolean rolloverTransactionSetControlNumber() {
        return this.rolloverTransactionSetControlNumber;
    }
    /**
     * @return The sender application id.
     * 
     */
    public String senderApplicationId() {
        return this.senderApplicationId;
    }
    /**
     * @return The transaction set control number lower bound.
     * 
     */
    public Integer transactionSetControlNumberLowerBound() {
        return this.transactionSetControlNumberLowerBound;
    }
    /**
     * @return The transaction set control number prefix.
     * 
     */
    public Optional<String> transactionSetControlNumberPrefix() {
        return Optional.ofNullable(this.transactionSetControlNumberPrefix);
    }
    /**
     * @return The transaction set control number suffix.
     * 
     */
    public Optional<String> transactionSetControlNumberSuffix() {
        return Optional.ofNullable(this.transactionSetControlNumberSuffix);
    }
    /**
     * @return The transaction set control number upper bound.
     * 
     */
    public Integer transactionSetControlNumberUpperBound() {
        return this.transactionSetControlNumberUpperBound;
    }
    /**
     * @return The usage indicator.
     * 
     */
    public String usageIndicator() {
        return this.usageIndicator;
    }
    /**
     * @return The value indicating whether to use control standards id as repetition character.
     * 
     */
    public Boolean useControlStandardsIdAsRepetitionCharacter() {
        return this.useControlStandardsIdAsRepetitionCharacter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12EnvelopeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer controlStandardsId;
        private String controlVersionNumber;
        private Boolean enableDefaultGroupHeaders;
        private @Nullable String functionalGroupId;
        private Integer groupControlNumberLowerBound;
        private Integer groupControlNumberUpperBound;
        private String groupHeaderAgencyCode;
        private String groupHeaderDateFormat;
        private String groupHeaderTimeFormat;
        private String groupHeaderVersion;
        private Integer interchangeControlNumberLowerBound;
        private Integer interchangeControlNumberUpperBound;
        private Boolean overwriteExistingTransactionSetControlNumber;
        private String receiverApplicationId;
        private Boolean rolloverGroupControlNumber;
        private Boolean rolloverInterchangeControlNumber;
        private Boolean rolloverTransactionSetControlNumber;
        private String senderApplicationId;
        private Integer transactionSetControlNumberLowerBound;
        private @Nullable String transactionSetControlNumberPrefix;
        private @Nullable String transactionSetControlNumberSuffix;
        private Integer transactionSetControlNumberUpperBound;
        private String usageIndicator;
        private Boolean useControlStandardsIdAsRepetitionCharacter;

        public Builder() {
    	      // Empty
        }

        public Builder(X12EnvelopeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlStandardsId = defaults.controlStandardsId;
    	      this.controlVersionNumber = defaults.controlVersionNumber;
    	      this.enableDefaultGroupHeaders = defaults.enableDefaultGroupHeaders;
    	      this.functionalGroupId = defaults.functionalGroupId;
    	      this.groupControlNumberLowerBound = defaults.groupControlNumberLowerBound;
    	      this.groupControlNumberUpperBound = defaults.groupControlNumberUpperBound;
    	      this.groupHeaderAgencyCode = defaults.groupHeaderAgencyCode;
    	      this.groupHeaderDateFormat = defaults.groupHeaderDateFormat;
    	      this.groupHeaderTimeFormat = defaults.groupHeaderTimeFormat;
    	      this.groupHeaderVersion = defaults.groupHeaderVersion;
    	      this.interchangeControlNumberLowerBound = defaults.interchangeControlNumberLowerBound;
    	      this.interchangeControlNumberUpperBound = defaults.interchangeControlNumberUpperBound;
    	      this.overwriteExistingTransactionSetControlNumber = defaults.overwriteExistingTransactionSetControlNumber;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.rolloverGroupControlNumber = defaults.rolloverGroupControlNumber;
    	      this.rolloverInterchangeControlNumber = defaults.rolloverInterchangeControlNumber;
    	      this.rolloverTransactionSetControlNumber = defaults.rolloverTransactionSetControlNumber;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.transactionSetControlNumberLowerBound = defaults.transactionSetControlNumberLowerBound;
    	      this.transactionSetControlNumberPrefix = defaults.transactionSetControlNumberPrefix;
    	      this.transactionSetControlNumberSuffix = defaults.transactionSetControlNumberSuffix;
    	      this.transactionSetControlNumberUpperBound = defaults.transactionSetControlNumberUpperBound;
    	      this.usageIndicator = defaults.usageIndicator;
    	      this.useControlStandardsIdAsRepetitionCharacter = defaults.useControlStandardsIdAsRepetitionCharacter;
        }

        public Builder controlStandardsId(Integer controlStandardsId) {
            this.controlStandardsId = Objects.requireNonNull(controlStandardsId);
            return this;
        }
        public Builder controlVersionNumber(String controlVersionNumber) {
            this.controlVersionNumber = Objects.requireNonNull(controlVersionNumber);
            return this;
        }
        public Builder enableDefaultGroupHeaders(Boolean enableDefaultGroupHeaders) {
            this.enableDefaultGroupHeaders = Objects.requireNonNull(enableDefaultGroupHeaders);
            return this;
        }
        public Builder functionalGroupId(@Nullable String functionalGroupId) {
            this.functionalGroupId = functionalGroupId;
            return this;
        }
        public Builder groupControlNumberLowerBound(Integer groupControlNumberLowerBound) {
            this.groupControlNumberLowerBound = Objects.requireNonNull(groupControlNumberLowerBound);
            return this;
        }
        public Builder groupControlNumberUpperBound(Integer groupControlNumberUpperBound) {
            this.groupControlNumberUpperBound = Objects.requireNonNull(groupControlNumberUpperBound);
            return this;
        }
        public Builder groupHeaderAgencyCode(String groupHeaderAgencyCode) {
            this.groupHeaderAgencyCode = Objects.requireNonNull(groupHeaderAgencyCode);
            return this;
        }
        public Builder groupHeaderDateFormat(String groupHeaderDateFormat) {
            this.groupHeaderDateFormat = Objects.requireNonNull(groupHeaderDateFormat);
            return this;
        }
        public Builder groupHeaderTimeFormat(String groupHeaderTimeFormat) {
            this.groupHeaderTimeFormat = Objects.requireNonNull(groupHeaderTimeFormat);
            return this;
        }
        public Builder groupHeaderVersion(String groupHeaderVersion) {
            this.groupHeaderVersion = Objects.requireNonNull(groupHeaderVersion);
            return this;
        }
        public Builder interchangeControlNumberLowerBound(Integer interchangeControlNumberLowerBound) {
            this.interchangeControlNumberLowerBound = Objects.requireNonNull(interchangeControlNumberLowerBound);
            return this;
        }
        public Builder interchangeControlNumberUpperBound(Integer interchangeControlNumberUpperBound) {
            this.interchangeControlNumberUpperBound = Objects.requireNonNull(interchangeControlNumberUpperBound);
            return this;
        }
        public Builder overwriteExistingTransactionSetControlNumber(Boolean overwriteExistingTransactionSetControlNumber) {
            this.overwriteExistingTransactionSetControlNumber = Objects.requireNonNull(overwriteExistingTransactionSetControlNumber);
            return this;
        }
        public Builder receiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }
        public Builder rolloverGroupControlNumber(Boolean rolloverGroupControlNumber) {
            this.rolloverGroupControlNumber = Objects.requireNonNull(rolloverGroupControlNumber);
            return this;
        }
        public Builder rolloverInterchangeControlNumber(Boolean rolloverInterchangeControlNumber) {
            this.rolloverInterchangeControlNumber = Objects.requireNonNull(rolloverInterchangeControlNumber);
            return this;
        }
        public Builder rolloverTransactionSetControlNumber(Boolean rolloverTransactionSetControlNumber) {
            this.rolloverTransactionSetControlNumber = Objects.requireNonNull(rolloverTransactionSetControlNumber);
            return this;
        }
        public Builder senderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }
        public Builder transactionSetControlNumberLowerBound(Integer transactionSetControlNumberLowerBound) {
            this.transactionSetControlNumberLowerBound = Objects.requireNonNull(transactionSetControlNumberLowerBound);
            return this;
        }
        public Builder transactionSetControlNumberPrefix(@Nullable String transactionSetControlNumberPrefix) {
            this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
            return this;
        }
        public Builder transactionSetControlNumberSuffix(@Nullable String transactionSetControlNumberSuffix) {
            this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
            return this;
        }
        public Builder transactionSetControlNumberUpperBound(Integer transactionSetControlNumberUpperBound) {
            this.transactionSetControlNumberUpperBound = Objects.requireNonNull(transactionSetControlNumberUpperBound);
            return this;
        }
        public Builder usageIndicator(String usageIndicator) {
            this.usageIndicator = Objects.requireNonNull(usageIndicator);
            return this;
        }
        public Builder useControlStandardsIdAsRepetitionCharacter(Boolean useControlStandardsIdAsRepetitionCharacter) {
            this.useControlStandardsIdAsRepetitionCharacter = Objects.requireNonNull(useControlStandardsIdAsRepetitionCharacter);
            return this;
        }        public X12EnvelopeSettingsResponse build() {
            return new X12EnvelopeSettingsResponse(controlStandardsId, controlVersionNumber, enableDefaultGroupHeaders, functionalGroupId, groupControlNumberLowerBound, groupControlNumberUpperBound, groupHeaderAgencyCode, groupHeaderDateFormat, groupHeaderTimeFormat, groupHeaderVersion, interchangeControlNumberLowerBound, interchangeControlNumberUpperBound, overwriteExistingTransactionSetControlNumber, receiverApplicationId, rolloverGroupControlNumber, rolloverInterchangeControlNumber, rolloverTransactionSetControlNumber, senderApplicationId, transactionSetControlNumberLowerBound, transactionSetControlNumberPrefix, transactionSetControlNumberSuffix, transactionSetControlNumberUpperBound, usageIndicator, useControlStandardsIdAsRepetitionCharacter);
        }
    }
}
