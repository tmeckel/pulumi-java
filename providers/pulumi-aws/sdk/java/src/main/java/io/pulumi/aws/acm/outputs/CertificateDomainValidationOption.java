// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateDomainValidationOption {
    /**
     * A domain name for which the certificate should be issued
     * 
     */
    private final @Nullable String domainName;
    /**
     * The name of the DNS record to create to validate the certificate
     * 
     */
    private final @Nullable String resourceRecordName;
    /**
     * The type of DNS record to create
     * 
     */
    private final @Nullable String resourceRecordType;
    /**
     * The value the DNS record needs to have
     * 
     */
    private final @Nullable String resourceRecordValue;

    @OutputCustomType.Constructor
    private CertificateDomainValidationOption(
        @OutputCustomType.Parameter("domainName") @Nullable String domainName,
        @OutputCustomType.Parameter("resourceRecordName") @Nullable String resourceRecordName,
        @OutputCustomType.Parameter("resourceRecordType") @Nullable String resourceRecordType,
        @OutputCustomType.Parameter("resourceRecordValue") @Nullable String resourceRecordValue) {
        this.domainName = domainName;
        this.resourceRecordName = resourceRecordName;
        this.resourceRecordType = resourceRecordType;
        this.resourceRecordValue = resourceRecordValue;
    }

    /**
     * A domain name for which the certificate should be issued
     * 
    */
    public Optional<String> getDomainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * The name of the DNS record to create to validate the certificate
     * 
    */
    public Optional<String> getResourceRecordName() {
        return Optional.ofNullable(this.resourceRecordName);
    }
    /**
     * The type of DNS record to create
     * 
    */
    public Optional<String> getResourceRecordType() {
        return Optional.ofNullable(this.resourceRecordType);
    }
    /**
     * The value the DNS record needs to have
     * 
    */
    public Optional<String> getResourceRecordValue() {
        return Optional.ofNullable(this.resourceRecordValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDomainValidationOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String resourceRecordName;
        private @Nullable String resourceRecordType;
        private @Nullable String resourceRecordValue;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDomainValidationOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.resourceRecordName = defaults.resourceRecordName;
    	      this.resourceRecordType = defaults.resourceRecordType;
    	      this.resourceRecordValue = defaults.resourceRecordValue;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder resourceRecordName(@Nullable String resourceRecordName) {
            this.resourceRecordName = resourceRecordName;
            return this;
        }

        public Builder resourceRecordType(@Nullable String resourceRecordType) {
            this.resourceRecordType = resourceRecordType;
            return this;
        }

        public Builder resourceRecordValue(@Nullable String resourceRecordValue) {
            this.resourceRecordValue = resourceRecordValue;
            return this;
        }
        public CertificateDomainValidationOption build() {
            return new CertificateDomainValidationOption(domainName, resourceRecordName, resourceRecordType, resourceRecordValue);
        }
    }
}
