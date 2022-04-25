// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.AlwaysLog;
import com.pulumi.azurenative.apimanagement.enums.HttpCorrelationProtocol;
import com.pulumi.azurenative.apimanagement.enums.OperationNameFormat;
import com.pulumi.azurenative.apimanagement.enums.Verbosity;
import com.pulumi.azurenative.apimanagement.inputs.PipelineDiagnosticSettingsArgs;
import com.pulumi.azurenative.apimanagement.inputs.SamplingSettingsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiDiagnosticArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticArgs Empty = new ApiDiagnosticArgs();

    /**
     * Specifies for what type of messages sampling settings should not apply.
     * 
     */
    @Import(name="alwaysLog")
    private @Nullable Output<Either<String,AlwaysLog>> alwaysLog;

    /**
     * @return Specifies for what type of messages sampling settings should not apply.
     * 
     */
    public Optional<Output<Either<String,AlwaysLog>>> alwaysLog() {
        return Optional.ofNullable(this.alwaysLog);
    }

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    @Import(name="backend")
    private @Nullable Output<PipelineDiagnosticSettingsArgs> backend;

    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    public Optional<Output<PipelineDiagnosticSettingsArgs>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="diagnosticId")
    private @Nullable Output<String> diagnosticId;

    /**
     * @return Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> diagnosticId() {
        return Optional.ofNullable(this.diagnosticId);
    }

    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    @Import(name="frontend")
    private @Nullable Output<PipelineDiagnosticSettingsArgs> frontend;

    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    public Optional<Output<PipelineDiagnosticSettingsArgs>> frontend() {
        return Optional.ofNullable(this.frontend);
    }

    /**
     * Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    @Import(name="httpCorrelationProtocol")
    private @Nullable Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol;

    /**
     * @return Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    public Optional<Output<Either<String,HttpCorrelationProtocol>>> httpCorrelationProtocol() {
        return Optional.ofNullable(this.httpCorrelationProtocol);
    }

    /**
     * Log the ClientIP. Default is false.
     * 
     */
    @Import(name="logClientIp")
    private @Nullable Output<Boolean> logClientIp;

    /**
     * @return Log the ClientIP. Default is false.
     * 
     */
    public Optional<Output<Boolean>> logClientIp() {
        return Optional.ofNullable(this.logClientIp);
    }

    /**
     * Resource Id of a target logger.
     * 
     */
    @Import(name="loggerId", required=true)
    private Output<String> loggerId;

    /**
     * @return Resource Id of a target logger.
     * 
     */
    public Output<String> loggerId() {
        return this.loggerId;
    }

    /**
     * The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    @Import(name="operationNameFormat")
    private @Nullable Output<Either<String,OperationNameFormat>> operationNameFormat;

    /**
     * @return The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    public Optional<Output<Either<String,OperationNameFormat>>> operationNameFormat() {
        return Optional.ofNullable(this.operationNameFormat);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sampling settings for Diagnostic.
     * 
     */
    @Import(name="sampling")
    private @Nullable Output<SamplingSettingsArgs> sampling;

    /**
     * @return Sampling settings for Diagnostic.
     * 
     */
    public Optional<Output<SamplingSettingsArgs>> sampling() {
        return Optional.ofNullable(this.sampling);
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The verbosity level applied to traces emitted by trace policies.
     * 
     */
    @Import(name="verbosity")
    private @Nullable Output<Either<String,Verbosity>> verbosity;

    /**
     * @return The verbosity level applied to traces emitted by trace policies.
     * 
     */
    public Optional<Output<Either<String,Verbosity>>> verbosity() {
        return Optional.ofNullable(this.verbosity);
    }

    private ApiDiagnosticArgs() {}

    private ApiDiagnosticArgs(ApiDiagnosticArgs $) {
        this.alwaysLog = $.alwaysLog;
        this.apiId = $.apiId;
        this.backend = $.backend;
        this.diagnosticId = $.diagnosticId;
        this.frontend = $.frontend;
        this.httpCorrelationProtocol = $.httpCorrelationProtocol;
        this.logClientIp = $.logClientIp;
        this.loggerId = $.loggerId;
        this.operationNameFormat = $.operationNameFormat;
        this.resourceGroupName = $.resourceGroupName;
        this.sampling = $.sampling;
        this.serviceName = $.serviceName;
        this.verbosity = $.verbosity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDiagnosticArgs $;

        public Builder() {
            $ = new ApiDiagnosticArgs();
        }

        public Builder(ApiDiagnosticArgs defaults) {
            $ = new ApiDiagnosticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysLog Specifies for what type of messages sampling settings should not apply.
         * 
         * @return builder
         * 
         */
        public Builder alwaysLog(@Nullable Output<Either<String,AlwaysLog>> alwaysLog) {
            $.alwaysLog = alwaysLog;
            return this;
        }

        /**
         * @param alwaysLog Specifies for what type of messages sampling settings should not apply.
         * 
         * @return builder
         * 
         */
        public Builder alwaysLog(Either<String,AlwaysLog> alwaysLog) {
            return alwaysLog(Output.of(alwaysLog));
        }

        /**
         * @param alwaysLog Specifies for what type of messages sampling settings should not apply.
         * 
         * @return builder
         * 
         */
        public Builder alwaysLog(String alwaysLog) {
            return alwaysLog(Either.ofLeft(alwaysLog));
        }

        /**
         * @param alwaysLog Specifies for what type of messages sampling settings should not apply.
         * 
         * @return builder
         * 
         */
        public Builder alwaysLog(AlwaysLog alwaysLog) {
            return alwaysLog(Either.ofRight(alwaysLog));
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param backend Diagnostic settings for incoming/outgoing HTTP messages to the Backend
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<PipelineDiagnosticSettingsArgs> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend Diagnostic settings for incoming/outgoing HTTP messages to the Backend
         * 
         * @return builder
         * 
         */
        public Builder backend(PipelineDiagnosticSettingsArgs backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticId(@Nullable Output<String> diagnosticId) {
            $.diagnosticId = diagnosticId;
            return this;
        }

        /**
         * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticId(String diagnosticId) {
            return diagnosticId(Output.of(diagnosticId));
        }

        /**
         * @param frontend Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
         * 
         * @return builder
         * 
         */
        public Builder frontend(@Nullable Output<PipelineDiagnosticSettingsArgs> frontend) {
            $.frontend = frontend;
            return this;
        }

        /**
         * @param frontend Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
         * 
         * @return builder
         * 
         */
        public Builder frontend(PipelineDiagnosticSettingsArgs frontend) {
            return frontend(Output.of(frontend));
        }

        /**
         * @param httpCorrelationProtocol Sets correlation protocol to use for Application Insights diagnostics.
         * 
         * @return builder
         * 
         */
        public Builder httpCorrelationProtocol(@Nullable Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol) {
            $.httpCorrelationProtocol = httpCorrelationProtocol;
            return this;
        }

        /**
         * @param httpCorrelationProtocol Sets correlation protocol to use for Application Insights diagnostics.
         * 
         * @return builder
         * 
         */
        public Builder httpCorrelationProtocol(Either<String,HttpCorrelationProtocol> httpCorrelationProtocol) {
            return httpCorrelationProtocol(Output.of(httpCorrelationProtocol));
        }

        /**
         * @param httpCorrelationProtocol Sets correlation protocol to use for Application Insights diagnostics.
         * 
         * @return builder
         * 
         */
        public Builder httpCorrelationProtocol(String httpCorrelationProtocol) {
            return httpCorrelationProtocol(Either.ofLeft(httpCorrelationProtocol));
        }

        /**
         * @param httpCorrelationProtocol Sets correlation protocol to use for Application Insights diagnostics.
         * 
         * @return builder
         * 
         */
        public Builder httpCorrelationProtocol(HttpCorrelationProtocol httpCorrelationProtocol) {
            return httpCorrelationProtocol(Either.ofRight(httpCorrelationProtocol));
        }

        /**
         * @param logClientIp Log the ClientIP. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder logClientIp(@Nullable Output<Boolean> logClientIp) {
            $.logClientIp = logClientIp;
            return this;
        }

        /**
         * @param logClientIp Log the ClientIP. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder logClientIp(Boolean logClientIp) {
            return logClientIp(Output.of(logClientIp));
        }

        /**
         * @param loggerId Resource Id of a target logger.
         * 
         * @return builder
         * 
         */
        public Builder loggerId(Output<String> loggerId) {
            $.loggerId = loggerId;
            return this;
        }

        /**
         * @param loggerId Resource Id of a target logger.
         * 
         * @return builder
         * 
         */
        public Builder loggerId(String loggerId) {
            return loggerId(Output.of(loggerId));
        }

        /**
         * @param operationNameFormat The format of the Operation Name for Application Insights telemetries. Default is Name.
         * 
         * @return builder
         * 
         */
        public Builder operationNameFormat(@Nullable Output<Either<String,OperationNameFormat>> operationNameFormat) {
            $.operationNameFormat = operationNameFormat;
            return this;
        }

        /**
         * @param operationNameFormat The format of the Operation Name for Application Insights telemetries. Default is Name.
         * 
         * @return builder
         * 
         */
        public Builder operationNameFormat(Either<String,OperationNameFormat> operationNameFormat) {
            return operationNameFormat(Output.of(operationNameFormat));
        }

        /**
         * @param operationNameFormat The format of the Operation Name for Application Insights telemetries. Default is Name.
         * 
         * @return builder
         * 
         */
        public Builder operationNameFormat(String operationNameFormat) {
            return operationNameFormat(Either.ofLeft(operationNameFormat));
        }

        /**
         * @param operationNameFormat The format of the Operation Name for Application Insights telemetries. Default is Name.
         * 
         * @return builder
         * 
         */
        public Builder operationNameFormat(OperationNameFormat operationNameFormat) {
            return operationNameFormat(Either.ofRight(operationNameFormat));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sampling Sampling settings for Diagnostic.
         * 
         * @return builder
         * 
         */
        public Builder sampling(@Nullable Output<SamplingSettingsArgs> sampling) {
            $.sampling = sampling;
            return this;
        }

        /**
         * @param sampling Sampling settings for Diagnostic.
         * 
         * @return builder
         * 
         */
        public Builder sampling(SamplingSettingsArgs sampling) {
            return sampling(Output.of(sampling));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param verbosity The verbosity level applied to traces emitted by trace policies.
         * 
         * @return builder
         * 
         */
        public Builder verbosity(@Nullable Output<Either<String,Verbosity>> verbosity) {
            $.verbosity = verbosity;
            return this;
        }

        /**
         * @param verbosity The verbosity level applied to traces emitted by trace policies.
         * 
         * @return builder
         * 
         */
        public Builder verbosity(Either<String,Verbosity> verbosity) {
            return verbosity(Output.of(verbosity));
        }

        /**
         * @param verbosity The verbosity level applied to traces emitted by trace policies.
         * 
         * @return builder
         * 
         */
        public Builder verbosity(String verbosity) {
            return verbosity(Either.ofLeft(verbosity));
        }

        /**
         * @param verbosity The verbosity level applied to traces emitted by trace policies.
         * 
         * @return builder
         * 
         */
        public Builder verbosity(Verbosity verbosity) {
            return verbosity(Either.ofRight(verbosity));
        }

        public ApiDiagnosticArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.loggerId = Objects.requireNonNull($.loggerId, "expected parameter 'loggerId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
