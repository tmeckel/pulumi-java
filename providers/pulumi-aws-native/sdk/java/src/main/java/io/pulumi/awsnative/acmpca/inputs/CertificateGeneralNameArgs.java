// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateEdiPartyNameArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateOtherNameArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateSubjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that contains X.509 GeneralName information. Assign one and ONLY one field.
 * 
 */
public final class CertificateGeneralNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateGeneralNameArgs Empty = new CertificateGeneralNameArgs();

    @InputImport(name="directoryName")
      private final @Nullable Input<CertificateSubjectArgs> directoryName;

    public Input<CertificateSubjectArgs> getDirectoryName() {
        return this.directoryName == null ? Input.empty() : this.directoryName;
    }

    @InputImport(name="dnsName")
      private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    @InputImport(name="ediPartyName")
      private final @Nullable Input<CertificateEdiPartyNameArgs> ediPartyName;

    public Input<CertificateEdiPartyNameArgs> getEdiPartyName() {
        return this.ediPartyName == null ? Input.empty() : this.ediPartyName;
    }

    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    @InputImport(name="otherName")
      private final @Nullable Input<CertificateOtherNameArgs> otherName;

    public Input<CertificateOtherNameArgs> getOtherName() {
        return this.otherName == null ? Input.empty() : this.otherName;
    }

    @InputImport(name="registeredId")
      private final @Nullable Input<String> registeredId;

    public Input<String> getRegisteredId() {
        return this.registeredId == null ? Input.empty() : this.registeredId;
    }

    @InputImport(name="rfc822Name")
      private final @Nullable Input<String> rfc822Name;

    public Input<String> getRfc822Name() {
        return this.rfc822Name == null ? Input.empty() : this.rfc822Name;
    }

    @InputImport(name="uniformResourceIdentifier")
      private final @Nullable Input<String> uniformResourceIdentifier;

    public Input<String> getUniformResourceIdentifier() {
        return this.uniformResourceIdentifier == null ? Input.empty() : this.uniformResourceIdentifier;
    }

    public CertificateGeneralNameArgs(
        @Nullable Input<CertificateSubjectArgs> directoryName,
        @Nullable Input<String> dnsName,
        @Nullable Input<CertificateEdiPartyNameArgs> ediPartyName,
        @Nullable Input<String> ipAddress,
        @Nullable Input<CertificateOtherNameArgs> otherName,
        @Nullable Input<String> registeredId,
        @Nullable Input<String> rfc822Name,
        @Nullable Input<String> uniformResourceIdentifier) {
        this.directoryName = directoryName;
        this.dnsName = dnsName;
        this.ediPartyName = ediPartyName;
        this.ipAddress = ipAddress;
        this.otherName = otherName;
        this.registeredId = registeredId;
        this.rfc822Name = rfc822Name;
        this.uniformResourceIdentifier = uniformResourceIdentifier;
    }

    private CertificateGeneralNameArgs() {
        this.directoryName = Input.empty();
        this.dnsName = Input.empty();
        this.ediPartyName = Input.empty();
        this.ipAddress = Input.empty();
        this.otherName = Input.empty();
        this.registeredId = Input.empty();
        this.rfc822Name = Input.empty();
        this.uniformResourceIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateGeneralNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateSubjectArgs> directoryName;
        private @Nullable Input<String> dnsName;
        private @Nullable Input<CertificateEdiPartyNameArgs> ediPartyName;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<CertificateOtherNameArgs> otherName;
        private @Nullable Input<String> registeredId;
        private @Nullable Input<String> rfc822Name;
        private @Nullable Input<String> uniformResourceIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateGeneralNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.dnsName = defaults.dnsName;
    	      this.ediPartyName = defaults.ediPartyName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.otherName = defaults.otherName;
    	      this.registeredId = defaults.registeredId;
    	      this.rfc822Name = defaults.rfc822Name;
    	      this.uniformResourceIdentifier = defaults.uniformResourceIdentifier;
        }

        public Builder directoryName(@Nullable Input<CertificateSubjectArgs> directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public Builder directoryName(@Nullable CertificateSubjectArgs directoryName) {
            this.directoryName = Input.ofNullable(directoryName);
            return this;
        }

        public Builder dnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder ediPartyName(@Nullable Input<CertificateEdiPartyNameArgs> ediPartyName) {
            this.ediPartyName = ediPartyName;
            return this;
        }

        public Builder ediPartyName(@Nullable CertificateEdiPartyNameArgs ediPartyName) {
            this.ediPartyName = Input.ofNullable(ediPartyName);
            return this;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder otherName(@Nullable Input<CertificateOtherNameArgs> otherName) {
            this.otherName = otherName;
            return this;
        }

        public Builder otherName(@Nullable CertificateOtherNameArgs otherName) {
            this.otherName = Input.ofNullable(otherName);
            return this;
        }

        public Builder registeredId(@Nullable Input<String> registeredId) {
            this.registeredId = registeredId;
            return this;
        }

        public Builder registeredId(@Nullable String registeredId) {
            this.registeredId = Input.ofNullable(registeredId);
            return this;
        }

        public Builder rfc822Name(@Nullable Input<String> rfc822Name) {
            this.rfc822Name = rfc822Name;
            return this;
        }

        public Builder rfc822Name(@Nullable String rfc822Name) {
            this.rfc822Name = Input.ofNullable(rfc822Name);
            return this;
        }

        public Builder uniformResourceIdentifier(@Nullable Input<String> uniformResourceIdentifier) {
            this.uniformResourceIdentifier = uniformResourceIdentifier;
            return this;
        }

        public Builder uniformResourceIdentifier(@Nullable String uniformResourceIdentifier) {
            this.uniformResourceIdentifier = Input.ofNullable(uniformResourceIdentifier);
            return this;
        }
        public CertificateGeneralNameArgs build() {
            return new CertificateGeneralNameArgs(directoryName, dnsName, ediPartyName, ipAddress, otherName, registeredId, rfc822Name, uniformResourceIdentifier);
        }
    }
}
