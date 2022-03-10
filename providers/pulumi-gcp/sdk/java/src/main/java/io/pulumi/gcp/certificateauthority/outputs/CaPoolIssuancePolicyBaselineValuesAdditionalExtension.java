// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CaPoolIssuancePolicyBaselineValuesAdditionalExtension {
    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    private final Boolean critical;
    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private final CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId objectId;
    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private CaPoolIssuancePolicyBaselineValuesAdditionalExtension(
        @OutputCustomType.Parameter("critical") Boolean critical,
        @OutputCustomType.Parameter("objectId") CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId objectId,
        @OutputCustomType.Parameter("value") String value) {
        this.critical = critical;
        this.objectId = objectId;
        this.value = value;
    }

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
    */
    public Boolean getCritical() {
        return this.critical;
    }
    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
    */
    public CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId getObjectId() {
        return this.objectId;
    }
    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesAdditionalExtension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean critical;
        private CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId objectId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesAdditionalExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder critical(Boolean critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder objectId(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public CaPoolIssuancePolicyBaselineValuesAdditionalExtension build() {
            return new CaPoolIssuancePolicyBaselineValuesAdditionalExtension(critical, objectId, value);
        }
    }
}
