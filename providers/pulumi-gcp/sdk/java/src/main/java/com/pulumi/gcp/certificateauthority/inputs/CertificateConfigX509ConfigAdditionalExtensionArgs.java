// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class CertificateConfigX509ConfigAdditionalExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigAdditionalExtensionArgs Empty = new CertificateConfigX509ConfigAdditionalExtensionArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    @Import(name="critical", required=true)
    private Output<Boolean> critical;

    /**
     * @return Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    public Output<Boolean> critical() {
        return this.critical;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId;

    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public Output<CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private CertificateConfigX509ConfigAdditionalExtensionArgs() {}

    private CertificateConfigX509ConfigAdditionalExtensionArgs(CertificateConfigX509ConfigAdditionalExtensionArgs $) {
        this.critical = $.critical;
        this.objectId = $.objectId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigAdditionalExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigAdditionalExtensionArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigAdditionalExtensionArgs();
        }

        public Builder(CertificateConfigX509ConfigAdditionalExtensionArgs defaults) {
            $ = new CertificateConfigX509ConfigAdditionalExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param critical Indicates whether or not this extension is critical (i.e., if the client does not know how to
         * handle this extension, the client should consider this to be an error).
         * 
         * @return builder
         * 
         */
        public Builder critical(Output<Boolean> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical Indicates whether or not this extension is critical (i.e., if the client does not know how to
         * handle this extension, the client should consider this to be an error).
         * 
         * @return builder
         * 
         */
        public Builder critical(Boolean critical) {
            return critical(Output.of(critical));
        }

        /**
         * @param objectId Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objectId(Output<CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objectId(CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param value The value of this X.509 extension. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of this X.509 extension. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CertificateConfigX509ConfigAdditionalExtensionArgs build() {
            $.critical = Objects.requireNonNull($.critical, "expected parameter 'critical' to be non-null");
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
