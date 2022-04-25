// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs();

    /**
     * The version of an Automation document to use during task execution.
     * 
     */
    @Import(name="documentVersion")
    private @Nullable Output<String> documentVersion;

    /**
     * @return The version of an Automation document to use during task execution.
     * 
     */
    public Optional<Output<String>> documentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }

    /**
     * The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs>> parameters;

    /**
     * @return The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    public Optional<Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs() {}

    private MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs $) {
        this.documentVersion = $.documentVersion;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs $;

        public Builder() {
            $ = new MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs();
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs defaults) {
            $ = new MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param documentVersion The version of an Automation document to use during task execution.
         * 
         * @return builder
         * 
         */
        public Builder documentVersion(@Nullable Output<String> documentVersion) {
            $.documentVersion = documentVersion;
            return this;
        }

        /**
         * @param documentVersion The version of an Automation document to use during task execution.
         * 
         * @return builder
         * 
         */
        public Builder documentVersion(String documentVersion) {
            return documentVersion(Output.of(documentVersion));
        }

        /**
         * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs build() {
            return $;
        }
    }

}
