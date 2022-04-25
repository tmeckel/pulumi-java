// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationArgs;
import com.pulumi.azurenative.azurearcdata.inputs.LogAnalyticsWorkspaceConfigArgs;
import com.pulumi.azurenative.azurearcdata.inputs.OnPremisePropertyArgs;
import com.pulumi.azurenative.azurearcdata.inputs.UploadServicePrincipalArgs;
import com.pulumi.azurenative.azurearcdata.inputs.UploadWatermarkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data controller properties.
 * 
 */
public final class DataControllerPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataControllerPropertiesArgs Empty = new DataControllerPropertiesArgs();

    /**
     * Username and password for basic login authentication.
     * 
     */
    @Import(name="basicLoginInformation")
    private @Nullable Output<BasicLoginInformationArgs> basicLoginInformation;

    /**
     * @return Username and password for basic login authentication.
     * 
     */
    public Optional<Output<BasicLoginInformationArgs>> basicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }

    /**
     * The raw kubernetes information
     * 
     */
    @Import(name="k8sRaw")
    private @Nullable Output<Object> k8sRaw;

    /**
     * @return The raw kubernetes information
     * 
     */
    public Optional<Output<Object>> k8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="lastUploadedDate")
    private @Nullable Output<String> lastUploadedDate;

    /**
     * @return Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<Output<String>> lastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }

    /**
     * Log analytics workspace id and primary key
     * 
     */
    @Import(name="logAnalyticsWorkspaceConfig")
    private @Nullable Output<LogAnalyticsWorkspaceConfigArgs> logAnalyticsWorkspaceConfig;

    /**
     * @return Log analytics workspace id and primary key
     * 
     */
    public Optional<Output<LogAnalyticsWorkspaceConfigArgs>> logAnalyticsWorkspaceConfig() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceConfig);
    }

    /**
     * Properties from the Kubernetes data controller
     * 
     */
    @Import(name="onPremiseProperty")
    private @Nullable Output<OnPremisePropertyArgs> onPremiseProperty;

    /**
     * @return Properties from the Kubernetes data controller
     * 
     */
    public Optional<Output<OnPremisePropertyArgs>> onPremiseProperty() {
        return Optional.ofNullable(this.onPremiseProperty);
    }

    /**
     * Service principal for uploading billing, metrics and logs.
     * 
     */
    @Import(name="uploadServicePrincipal")
    private @Nullable Output<UploadServicePrincipalArgs> uploadServicePrincipal;

    /**
     * @return Service principal for uploading billing, metrics and logs.
     * 
     */
    public Optional<Output<UploadServicePrincipalArgs>> uploadServicePrincipal() {
        return Optional.ofNullable(this.uploadServicePrincipal);
    }

    /**
     * Properties on upload watermark.  Mostly timestamp for each upload data type
     * 
     */
    @Import(name="uploadWatermark")
    private @Nullable Output<UploadWatermarkArgs> uploadWatermark;

    /**
     * @return Properties on upload watermark.  Mostly timestamp for each upload data type
     * 
     */
    public Optional<Output<UploadWatermarkArgs>> uploadWatermark() {
        return Optional.ofNullable(this.uploadWatermark);
    }

    private DataControllerPropertiesArgs() {}

    private DataControllerPropertiesArgs(DataControllerPropertiesArgs $) {
        this.basicLoginInformation = $.basicLoginInformation;
        this.k8sRaw = $.k8sRaw;
        this.lastUploadedDate = $.lastUploadedDate;
        this.logAnalyticsWorkspaceConfig = $.logAnalyticsWorkspaceConfig;
        this.onPremiseProperty = $.onPremiseProperty;
        this.uploadServicePrincipal = $.uploadServicePrincipal;
        this.uploadWatermark = $.uploadWatermark;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataControllerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataControllerPropertiesArgs $;

        public Builder() {
            $ = new DataControllerPropertiesArgs();
        }

        public Builder(DataControllerPropertiesArgs defaults) {
            $ = new DataControllerPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicLoginInformation Username and password for basic login authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicLoginInformation(@Nullable Output<BasicLoginInformationArgs> basicLoginInformation) {
            $.basicLoginInformation = basicLoginInformation;
            return this;
        }

        /**
         * @param basicLoginInformation Username and password for basic login authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicLoginInformation(BasicLoginInformationArgs basicLoginInformation) {
            return basicLoginInformation(Output.of(basicLoginInformation));
        }

        /**
         * @param k8sRaw The raw kubernetes information
         * 
         * @return builder
         * 
         */
        public Builder k8sRaw(@Nullable Output<Object> k8sRaw) {
            $.k8sRaw = k8sRaw;
            return this;
        }

        /**
         * @param k8sRaw The raw kubernetes information
         * 
         * @return builder
         * 
         */
        public Builder k8sRaw(Object k8sRaw) {
            return k8sRaw(Output.of(k8sRaw));
        }

        /**
         * @param lastUploadedDate Last uploaded date from Kubernetes cluster. Defaults to current date time
         * 
         * @return builder
         * 
         */
        public Builder lastUploadedDate(@Nullable Output<String> lastUploadedDate) {
            $.lastUploadedDate = lastUploadedDate;
            return this;
        }

        /**
         * @param lastUploadedDate Last uploaded date from Kubernetes cluster. Defaults to current date time
         * 
         * @return builder
         * 
         */
        public Builder lastUploadedDate(String lastUploadedDate) {
            return lastUploadedDate(Output.of(lastUploadedDate));
        }

        /**
         * @param logAnalyticsWorkspaceConfig Log analytics workspace id and primary key
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceConfig(@Nullable Output<LogAnalyticsWorkspaceConfigArgs> logAnalyticsWorkspaceConfig) {
            $.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceConfig Log analytics workspace id and primary key
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceConfig(LogAnalyticsWorkspaceConfigArgs logAnalyticsWorkspaceConfig) {
            return logAnalyticsWorkspaceConfig(Output.of(logAnalyticsWorkspaceConfig));
        }

        /**
         * @param onPremiseProperty Properties from the Kubernetes data controller
         * 
         * @return builder
         * 
         */
        public Builder onPremiseProperty(@Nullable Output<OnPremisePropertyArgs> onPremiseProperty) {
            $.onPremiseProperty = onPremiseProperty;
            return this;
        }

        /**
         * @param onPremiseProperty Properties from the Kubernetes data controller
         * 
         * @return builder
         * 
         */
        public Builder onPremiseProperty(OnPremisePropertyArgs onPremiseProperty) {
            return onPremiseProperty(Output.of(onPremiseProperty));
        }

        /**
         * @param uploadServicePrincipal Service principal for uploading billing, metrics and logs.
         * 
         * @return builder
         * 
         */
        public Builder uploadServicePrincipal(@Nullable Output<UploadServicePrincipalArgs> uploadServicePrincipal) {
            $.uploadServicePrincipal = uploadServicePrincipal;
            return this;
        }

        /**
         * @param uploadServicePrincipal Service principal for uploading billing, metrics and logs.
         * 
         * @return builder
         * 
         */
        public Builder uploadServicePrincipal(UploadServicePrincipalArgs uploadServicePrincipal) {
            return uploadServicePrincipal(Output.of(uploadServicePrincipal));
        }

        /**
         * @param uploadWatermark Properties on upload watermark.  Mostly timestamp for each upload data type
         * 
         * @return builder
         * 
         */
        public Builder uploadWatermark(@Nullable Output<UploadWatermarkArgs> uploadWatermark) {
            $.uploadWatermark = uploadWatermark;
            return this;
        }

        /**
         * @param uploadWatermark Properties on upload watermark.  Mostly timestamp for each upload data type
         * 
         * @return builder
         * 
         */
        public Builder uploadWatermark(UploadWatermarkArgs uploadWatermark) {
            return uploadWatermark(Output.of(uploadWatermark));
        }

        public DataControllerPropertiesArgs build() {
            return $;
        }
    }

}
