// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.batch.enums.CertificateFormat;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * 
     */
    @InputImport(name="certificateName")
      private final @Nullable Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName == null ? Input.empty() : this.certificateName;
    }

    /**
     * The maximum size is 10KB.
     * 
     */
    @InputImport(name="data", required=true)
      private final Input<String> data;

    public Input<String> getData() {
        return this.data;
    }

    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Input<CertificateFormat> format;

    public Input<CertificateFormat> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * This must not be specified if the certificate format is Cer.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * This must match the thumbprint from the name.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    /**
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     * 
     */
    @InputImport(name="thumbprintAlgorithm")
      private final @Nullable Input<String> thumbprintAlgorithm;

    public Input<String> getThumbprintAlgorithm() {
        return this.thumbprintAlgorithm == null ? Input.empty() : this.thumbprintAlgorithm;
    }

    public CertificateArgs(
        Input<String> accountName,
        @Nullable Input<String> certificateName,
        Input<String> data,
        @Nullable Input<CertificateFormat> format,
        @Nullable Input<String> password,
        Input<String> resourceGroupName,
        @Nullable Input<String> thumbprint,
        @Nullable Input<String> thumbprintAlgorithm) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.certificateName = certificateName;
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.format = format;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
    }

    private CertificateArgs() {
        this.accountName = Input.empty();
        this.certificateName = Input.empty();
        this.data = Input.empty();
        this.format = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.thumbprint = Input.empty();
        this.thumbprintAlgorithm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> certificateName;
        private Input<String> data;
        private @Nullable Input<CertificateFormat> format;
        private @Nullable Input<String> password;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> thumbprint;
        private @Nullable Input<String> thumbprintAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.certificateName = defaults.certificateName;
    	      this.data = defaults.data;
    	      this.format = defaults.format;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintAlgorithm = defaults.thumbprintAlgorithm;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder certificateName(@Nullable Input<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Input.ofNullable(certificateName);
            return this;
        }

        public Builder data(Input<String> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder data(String data) {
            this.data = Input.of(Objects.requireNonNull(data));
            return this;
        }

        public Builder format(@Nullable Input<CertificateFormat> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable CertificateFormat format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder password(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder thumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }

        public Builder thumbprintAlgorithm(@Nullable Input<String> thumbprintAlgorithm) {
            this.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }

        public Builder thumbprintAlgorithm(@Nullable String thumbprintAlgorithm) {
            this.thumbprintAlgorithm = Input.ofNullable(thumbprintAlgorithm);
            return this;
        }
        public CertificateArgs build() {
            return new CertificateArgs(accountName, certificateName, data, format, password, resourceGroupName, thumbprint, thumbprintAlgorithm);
        }
    }
}
