// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDomainEncryptionAtRest extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainEncryptionAtRest Empty = new GetDomainEncryptionAtRest();

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether node to node encryption is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * The KMS key id used to encrypt data at rest.
     * 
     */
    @Import(name="kmsKeyId", required=true)
    private String kmsKeyId;

    /**
     * @return The KMS key id used to encrypt data at rest.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    private GetDomainEncryptionAtRest() {}

    private GetDomainEncryptionAtRest(GetDomainEncryptionAtRest $) {
        this.enabled = $.enabled;
        this.kmsKeyId = $.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainEncryptionAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainEncryptionAtRest $;

        public Builder() {
            $ = new GetDomainEncryptionAtRest();
        }

        public Builder(GetDomainEncryptionAtRest defaults) {
            $ = new GetDomainEncryptionAtRest(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether node to node encryption is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param kmsKeyId The KMS key id used to encrypt data at rest.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public GetDomainEncryptionAtRest build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.kmsKeyId = Objects.requireNonNull($.kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
            return $;
        }
    }

}
