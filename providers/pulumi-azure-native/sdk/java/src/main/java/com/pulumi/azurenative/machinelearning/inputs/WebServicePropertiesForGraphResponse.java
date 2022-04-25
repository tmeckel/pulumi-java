// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.AssetItemResponse;
import com.pulumi.azurenative.machinelearning.inputs.BlobLocationResponse;
import com.pulumi.azurenative.machinelearning.inputs.CommitmentPlanResponse;
import com.pulumi.azurenative.machinelearning.inputs.DiagnosticsConfigurationResponse;
import com.pulumi.azurenative.machinelearning.inputs.ExampleRequestResponse;
import com.pulumi.azurenative.machinelearning.inputs.GraphPackageResponse;
import com.pulumi.azurenative.machinelearning.inputs.MachineLearningWorkspaceResponse;
import com.pulumi.azurenative.machinelearning.inputs.RealtimeConfigurationResponse;
import com.pulumi.azurenative.machinelearning.inputs.ServiceInputOutputSpecificationResponse;
import com.pulumi.azurenative.machinelearning.inputs.StorageAccountResponse;
import com.pulumi.azurenative.machinelearning.inputs.WebServiceKeysResponse;
import com.pulumi.azurenative.machinelearning.inputs.WebServiceParameterResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to a Graph based web service.
 * 
 */
public final class WebServicePropertiesForGraphResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebServicePropertiesForGraphResponse Empty = new WebServicePropertiesForGraphResponse();

    /**
     * Contains user defined properties describing web service assets. Properties are expressed as Key/Value pairs.
     * 
     */
    @Import(name="assets")
    private @Nullable Map<String,AssetItemResponse> assets;

    /**
     * @return Contains user defined properties describing web service assets. Properties are expressed as Key/Value pairs.
     * 
     */
    public Optional<Map<String,AssetItemResponse>> assets() {
        return Optional.ofNullable(this.assets);
    }

    /**
     * Contains the commitment plan associated with this web service. Set at creation time. Once set, this value cannot be changed. Note: The commitment plan is not returned from calls to GET operations.
     * 
     */
    @Import(name="commitmentPlan")
    private @Nullable CommitmentPlanResponse commitmentPlan;

    /**
     * @return Contains the commitment plan associated with this web service. Set at creation time. Once set, this value cannot be changed. Note: The commitment plan is not returned from calls to GET operations.
     * 
     */
    public Optional<CommitmentPlanResponse> commitmentPlan() {
        return Optional.ofNullable(this.commitmentPlan);
    }

    /**
     * Read Only: The date and time when the web service was created.
     * 
     */
    @Import(name="createdOn", required=true)
    private String createdOn;

    /**
     * @return Read Only: The date and time when the web service was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }

    /**
     * The description of the web service.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description of the web service.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Settings controlling the diagnostics traces collection for the web service.
     * 
     */
    @Import(name="diagnostics")
    private @Nullable DiagnosticsConfigurationResponse diagnostics;

    /**
     * @return Settings controlling the diagnostics traces collection for the web service.
     * 
     */
    public Optional<DiagnosticsConfigurationResponse> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }

    /**
     * Defines sample input data for one or more of the service&#39;s inputs.
     * 
     */
    @Import(name="exampleRequest")
    private @Nullable ExampleRequestResponse exampleRequest;

    /**
     * @return Defines sample input data for one or more of the service&#39;s inputs.
     * 
     */
    public Optional<ExampleRequestResponse> exampleRequest() {
        return Optional.ofNullable(this.exampleRequest);
    }

    /**
     * When set to true, sample data is included in the web service&#39;s swagger definition. The default value is true.
     * 
     */
    @Import(name="exposeSampleData")
    private @Nullable Boolean exposeSampleData;

    /**
     * @return When set to true, sample data is included in the web service&#39;s swagger definition. The default value is true.
     * 
     */
    public Optional<Boolean> exposeSampleData() {
        return Optional.ofNullable(this.exposeSampleData);
    }

    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service&#39;s inputs. For more information, see the Swagger specification.
     * 
     */
    @Import(name="input")
    private @Nullable ServiceInputOutputSpecificationResponse input;

    /**
     * @return Contains the Swagger 2.0 schema describing one or more of the web service&#39;s inputs. For more information, see the Swagger specification.
     * 
     */
    public Optional<ServiceInputOutputSpecificationResponse> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Contains the web service provisioning keys. If you do not specify provisioning keys, the Azure Machine Learning system generates them for you. Note: The keys are not returned from calls to GET operations.
     * 
     */
    @Import(name="keys")
    private @Nullable WebServiceKeysResponse keys;

    /**
     * @return Contains the web service provisioning keys. If you do not specify provisioning keys, the Azure Machine Learning system generates them for you. Note: The keys are not returned from calls to GET operations.
     * 
     */
    public Optional<WebServiceKeysResponse> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Specifies the Machine Learning workspace containing the experiment that is source for the web service.
     * 
     */
    @Import(name="machineLearningWorkspace")
    private @Nullable MachineLearningWorkspaceResponse machineLearningWorkspace;

    /**
     * @return Specifies the Machine Learning workspace containing the experiment that is source for the web service.
     * 
     */
    public Optional<MachineLearningWorkspaceResponse> machineLearningWorkspace() {
        return Optional.ofNullable(this.machineLearningWorkspace);
    }

    /**
     * Read Only: The date and time when the web service was last modified.
     * 
     */
    @Import(name="modifiedOn", required=true)
    private String modifiedOn;

    /**
     * @return Read Only: The date and time when the web service was last modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }

    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service&#39;s outputs. For more information, see the Swagger specification.
     * 
     */
    @Import(name="output")
    private @Nullable ServiceInputOutputSpecificationResponse output;

    /**
     * @return Contains the Swagger 2.0 schema describing one or more of the web service&#39;s outputs. For more information, see the Swagger specification.
     * 
     */
    public Optional<ServiceInputOutputSpecificationResponse> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * The definition of the graph package making up this web service.
     * 
     */
    @Import(name="package")
    private @Nullable GraphPackageResponse package_;

    /**
     * @return The definition of the graph package making up this web service.
     * 
     */
    public Optional<GraphPackageResponse> package_() {
        return Optional.ofNullable(this.package_);
    }

    /**
     * Specifies the package type. Valid values are Graph (Specifies a web service published through the Machine Learning Studio) and Code (Specifies a web service published using code such as Python). Note: Code is not supported at this time.
     * Expected value is &#39;Graph&#39;.
     * 
     */
    @Import(name="packageType", required=true)
    private String packageType;

    /**
     * @return Specifies the package type. Valid values are Graph (Specifies a web service published through the Machine Learning Studio) and Code (Specifies a web service published using code such as Python). Note: Code is not supported at this time.
     * Expected value is &#39;Graph&#39;.
     * 
     */
    public String packageType() {
        return this.packageType;
    }

    /**
     * The set of global parameters values defined for the web service, given as a global parameter name to default value map. If no default value is specified, the parameter is considered to be required.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,WebServiceParameterResponse> parameters;

    /**
     * @return The set of global parameters values defined for the web service, given as a global parameter name to default value map. If no default value is specified, the parameter is considered to be required.
     * 
     */
    public Optional<Map<String,WebServiceParameterResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * When set to true, indicates that the payload size is larger than 3 MB. Otherwise false. If the payload size exceed 3 MB, the payload is stored in a blob and the PayloadsLocation parameter contains the URI of the blob. Otherwise, this will be set to false and Assets, Input, Output, Package, Parameters, ExampleRequest are inline. The Payload sizes is determined by adding the size of the Assets, Input, Output, Package, Parameters, and the ExampleRequest.
     * 
     */
    @Import(name="payloadsInBlobStorage")
    private @Nullable Boolean payloadsInBlobStorage;

    /**
     * @return When set to true, indicates that the payload size is larger than 3 MB. Otherwise false. If the payload size exceed 3 MB, the payload is stored in a blob and the PayloadsLocation parameter contains the URI of the blob. Otherwise, this will be set to false and Assets, Input, Output, Package, Parameters, ExampleRequest are inline. The Payload sizes is determined by adding the size of the Assets, Input, Output, Package, Parameters, and the ExampleRequest.
     * 
     */
    public Optional<Boolean> payloadsInBlobStorage() {
        return Optional.ofNullable(this.payloadsInBlobStorage);
    }

    /**
     * The URI of the payload blob. This parameter contains a value only if the payloadsInBlobStorage parameter is set to true. Otherwise is set to null.
     * 
     */
    @Import(name="payloadsLocation")
    private @Nullable BlobLocationResponse payloadsLocation;

    /**
     * @return The URI of the payload blob. This parameter contains a value only if the payloadsInBlobStorage parameter is set to true. Otherwise is set to null.
     * 
     */
    public Optional<BlobLocationResponse> payloadsLocation() {
        return Optional.ofNullable(this.payloadsLocation);
    }

    /**
     * Read Only: The provision state of the web service. Valid values are Unknown, Provisioning, Succeeded, and Failed.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Read Only: The provision state of the web service. Valid values are Unknown, Provisioning, Succeeded, and Failed.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * When set to true, indicates that the web service is read-only and can no longer be updated or patched, only removed. Default, is false. Note: Once set to true, you cannot change its value.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Boolean readOnly;

    /**
     * @return When set to true, indicates that the web service is read-only and can no longer be updated or patched, only removed. Default, is false. Note: Once set to true, you cannot change its value.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * Contains the configuration settings for the web service endpoint.
     * 
     */
    @Import(name="realtimeConfiguration")
    private @Nullable RealtimeConfigurationResponse realtimeConfiguration;

    /**
     * @return Contains the configuration settings for the web service endpoint.
     * 
     */
    public Optional<RealtimeConfigurationResponse> realtimeConfiguration() {
        return Optional.ofNullable(this.realtimeConfiguration);
    }

    /**
     * Specifies the storage account that Azure Machine Learning uses to store information about the web service. Only the name of the storage account is returned from calls to GET operations. When updating the storage account information, you must ensure that all necessary assets are available in the new storage account or calls to your web service will fail.
     * 
     */
    @Import(name="storageAccount")
    private @Nullable StorageAccountResponse storageAccount;

    /**
     * @return Specifies the storage account that Azure Machine Learning uses to store information about the web service. Only the name of the storage account is returned from calls to GET operations. When updating the storage account information, you must ensure that all necessary assets are available in the new storage account or calls to your web service will fail.
     * 
     */
    public Optional<StorageAccountResponse> storageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }

    /**
     * Read Only: Contains the URI of the swagger spec associated with this web service.
     * 
     */
    @Import(name="swaggerLocation", required=true)
    private String swaggerLocation;

    /**
     * @return Read Only: Contains the URI of the swagger spec associated with this web service.
     * 
     */
    public String swaggerLocation() {
        return this.swaggerLocation;
    }

    /**
     * The title of the web service.
     * 
     */
    @Import(name="title")
    private @Nullable String title;

    /**
     * @return The title of the web service.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    private WebServicePropertiesForGraphResponse() {}

    private WebServicePropertiesForGraphResponse(WebServicePropertiesForGraphResponse $) {
        this.assets = $.assets;
        this.commitmentPlan = $.commitmentPlan;
        this.createdOn = $.createdOn;
        this.description = $.description;
        this.diagnostics = $.diagnostics;
        this.exampleRequest = $.exampleRequest;
        this.exposeSampleData = $.exposeSampleData;
        this.input = $.input;
        this.keys = $.keys;
        this.machineLearningWorkspace = $.machineLearningWorkspace;
        this.modifiedOn = $.modifiedOn;
        this.output = $.output;
        this.package_ = $.package_;
        this.packageType = $.packageType;
        this.parameters = $.parameters;
        this.payloadsInBlobStorage = $.payloadsInBlobStorage;
        this.payloadsLocation = $.payloadsLocation;
        this.provisioningState = $.provisioningState;
        this.readOnly = $.readOnly;
        this.realtimeConfiguration = $.realtimeConfiguration;
        this.storageAccount = $.storageAccount;
        this.swaggerLocation = $.swaggerLocation;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebServicePropertiesForGraphResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebServicePropertiesForGraphResponse $;

        public Builder() {
            $ = new WebServicePropertiesForGraphResponse();
        }

        public Builder(WebServicePropertiesForGraphResponse defaults) {
            $ = new WebServicePropertiesForGraphResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param assets Contains user defined properties describing web service assets. Properties are expressed as Key/Value pairs.
         * 
         * @return builder
         * 
         */
        public Builder assets(@Nullable Map<String,AssetItemResponse> assets) {
            $.assets = assets;
            return this;
        }

        /**
         * @param commitmentPlan Contains the commitment plan associated with this web service. Set at creation time. Once set, this value cannot be changed. Note: The commitment plan is not returned from calls to GET operations.
         * 
         * @return builder
         * 
         */
        public Builder commitmentPlan(@Nullable CommitmentPlanResponse commitmentPlan) {
            $.commitmentPlan = commitmentPlan;
            return this;
        }

        /**
         * @param createdOn Read Only: The date and time when the web service was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param description The description of the web service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param diagnostics Settings controlling the diagnostics traces collection for the web service.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(@Nullable DiagnosticsConfigurationResponse diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        /**
         * @param exampleRequest Defines sample input data for one or more of the service&#39;s inputs.
         * 
         * @return builder
         * 
         */
        public Builder exampleRequest(@Nullable ExampleRequestResponse exampleRequest) {
            $.exampleRequest = exampleRequest;
            return this;
        }

        /**
         * @param exposeSampleData When set to true, sample data is included in the web service&#39;s swagger definition. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder exposeSampleData(@Nullable Boolean exposeSampleData) {
            $.exposeSampleData = exposeSampleData;
            return this;
        }

        /**
         * @param input Contains the Swagger 2.0 schema describing one or more of the web service&#39;s inputs. For more information, see the Swagger specification.
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable ServiceInputOutputSpecificationResponse input) {
            $.input = input;
            return this;
        }

        /**
         * @param keys Contains the web service provisioning keys. If you do not specify provisioning keys, the Azure Machine Learning system generates them for you. Note: The keys are not returned from calls to GET operations.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable WebServiceKeysResponse keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param machineLearningWorkspace Specifies the Machine Learning workspace containing the experiment that is source for the web service.
         * 
         * @return builder
         * 
         */
        public Builder machineLearningWorkspace(@Nullable MachineLearningWorkspaceResponse machineLearningWorkspace) {
            $.machineLearningWorkspace = machineLearningWorkspace;
            return this;
        }

        /**
         * @param modifiedOn Read Only: The date and time when the web service was last modified.
         * 
         * @return builder
         * 
         */
        public Builder modifiedOn(String modifiedOn) {
            $.modifiedOn = modifiedOn;
            return this;
        }

        /**
         * @param output Contains the Swagger 2.0 schema describing one or more of the web service&#39;s outputs. For more information, see the Swagger specification.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable ServiceInputOutputSpecificationResponse output) {
            $.output = output;
            return this;
        }

        /**
         * @param package_ The definition of the graph package making up this web service.
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable GraphPackageResponse package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param packageType Specifies the package type. Valid values are Graph (Specifies a web service published through the Machine Learning Studio) and Code (Specifies a web service published using code such as Python). Note: Code is not supported at this time.
         * Expected value is &#39;Graph&#39;.
         * 
         * @return builder
         * 
         */
        public Builder packageType(String packageType) {
            $.packageType = packageType;
            return this;
        }

        /**
         * @param parameters The set of global parameters values defined for the web service, given as a global parameter name to default value map. If no default value is specified, the parameter is considered to be required.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Map<String,WebServiceParameterResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param payloadsInBlobStorage When set to true, indicates that the payload size is larger than 3 MB. Otherwise false. If the payload size exceed 3 MB, the payload is stored in a blob and the PayloadsLocation parameter contains the URI of the blob. Otherwise, this will be set to false and Assets, Input, Output, Package, Parameters, ExampleRequest are inline. The Payload sizes is determined by adding the size of the Assets, Input, Output, Package, Parameters, and the ExampleRequest.
         * 
         * @return builder
         * 
         */
        public Builder payloadsInBlobStorage(@Nullable Boolean payloadsInBlobStorage) {
            $.payloadsInBlobStorage = payloadsInBlobStorage;
            return this;
        }

        /**
         * @param payloadsLocation The URI of the payload blob. This parameter contains a value only if the payloadsInBlobStorage parameter is set to true. Otherwise is set to null.
         * 
         * @return builder
         * 
         */
        public Builder payloadsLocation(@Nullable BlobLocationResponse payloadsLocation) {
            $.payloadsLocation = payloadsLocation;
            return this;
        }

        /**
         * @param provisioningState Read Only: The provision state of the web service. Valid values are Unknown, Provisioning, Succeeded, and Failed.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param readOnly When set to true, indicates that the web service is read-only and can no longer be updated or patched, only removed. Default, is false. Note: Once set to true, you cannot change its value.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Boolean readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param realtimeConfiguration Contains the configuration settings for the web service endpoint.
         * 
         * @return builder
         * 
         */
        public Builder realtimeConfiguration(@Nullable RealtimeConfigurationResponse realtimeConfiguration) {
            $.realtimeConfiguration = realtimeConfiguration;
            return this;
        }

        /**
         * @param storageAccount Specifies the storage account that Azure Machine Learning uses to store information about the web service. Only the name of the storage account is returned from calls to GET operations. When updating the storage account information, you must ensure that all necessary assets are available in the new storage account or calls to your web service will fail.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(@Nullable StorageAccountResponse storageAccount) {
            $.storageAccount = storageAccount;
            return this;
        }

        /**
         * @param swaggerLocation Read Only: Contains the URI of the swagger spec associated with this web service.
         * 
         * @return builder
         * 
         */
        public Builder swaggerLocation(String swaggerLocation) {
            $.swaggerLocation = swaggerLocation;
            return this;
        }

        /**
         * @param title The title of the web service.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable String title) {
            $.title = title;
            return this;
        }

        public WebServicePropertiesForGraphResponse build() {
            $.createdOn = Objects.requireNonNull($.createdOn, "expected parameter 'createdOn' to be non-null");
            $.modifiedOn = Objects.requireNonNull($.modifiedOn, "expected parameter 'modifiedOn' to be non-null");
            $.packageType = Codegen.stringProp("packageType").arg($.packageType).require();
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.swaggerLocation = Objects.requireNonNull($.swaggerLocation, "expected parameter 'swaggerLocation' to be non-null");
            return $;
        }
    }

}
