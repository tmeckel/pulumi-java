// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch;

import com.pulumi.azurenative.batch.enums.CertificateFormat;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * 
     */
    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    /**
     * @return The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * 
     */
    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * The maximum size is 10KB.
     * 
     */
    @Import(name="data", required=true)
    private Output<String> data;

    /**
     * @return The maximum size is 10KB.
     * 
     */
    public Output<String> data() {
        return this.data;
    }

    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    @Import(name="format")
    private @Nullable Output<CertificateFormat> format;

    /**
     * @return The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    public Optional<Output<CertificateFormat>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * This must not be specified if the certificate format is Cer.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return This must not be specified if the certificate format is Cer.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the Batch account.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * This must match the thumbprint from the name.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return This must match the thumbprint from the name.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    /**
     * This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
     * 
     */
    @Import(name="thumbprintAlgorithm")
    private @Nullable Output<String> thumbprintAlgorithm;

    /**
     * @return This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
     * 
     */
    public Optional<Output<String>> thumbprintAlgorithm() {
        return Optional.ofNullable(this.thumbprintAlgorithm);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.accountName = $.accountName;
        this.certificateName = $.certificateName;
        this.data = $.data;
        this.format = $.format;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.thumbprint = $.thumbprint;
        this.thumbprintAlgorithm = $.thumbprintAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param data The maximum size is 10KB.
         * 
         * @return builder
         * 
         */
        public Builder data(Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The maximum size is 10KB.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param format The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<CertificateFormat> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
         * 
         * @return builder
         * 
         */
        public Builder format(CertificateFormat format) {
            return format(Output.of(format));
        }

        /**
         * @param password This must not be specified if the certificate format is Cer.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password This must not be specified if the certificate format is Cer.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param thumbprint This must match the thumbprint from the name.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint This must match the thumbprint from the name.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param thumbprintAlgorithm This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintAlgorithm(@Nullable Output<String> thumbprintAlgorithm) {
            $.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }

        /**
         * @param thumbprintAlgorithm This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintAlgorithm(String thumbprintAlgorithm) {
            return thumbprintAlgorithm(Output.of(thumbprintAlgorithm));
        }

        public CertificateArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.data = Objects.requireNonNull($.data, "expected parameter 'data' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
