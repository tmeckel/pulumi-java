// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.ConfigFileArgs;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.ImportFileArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetConfigurationArgs Empty = new TargetConfigurationArgs();

    /**
     * The configuration to use for this deployment.
     * 
     */
    @Import(name="config")
    private @Nullable Output<ConfigFileArgs> config;

    /**
     * @return The configuration to use for this deployment.
     * 
     */
    public Optional<Output<ConfigFileArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    @Import(name="imports")
    private @Nullable Output<List<ImportFileArgs>> imports;

    /**
     * @return Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    public Optional<Output<List<ImportFileArgs>>> imports() {
        return Optional.ofNullable(this.imports);
    }

    private TargetConfigurationArgs() {}

    private TargetConfigurationArgs(TargetConfigurationArgs $) {
        this.config = $.config;
        this.imports = $.imports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetConfigurationArgs $;

        public Builder() {
            $ = new TargetConfigurationArgs();
        }

        public Builder(TargetConfigurationArgs defaults) {
            $ = new TargetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration to use for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<ConfigFileArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration to use for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder config(ConfigFileArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param imports Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
         * 
         * @return builder
         * 
         */
        public Builder imports(@Nullable Output<List<ImportFileArgs>> imports) {
            $.imports = imports;
            return this;
        }

        /**
         * @param imports Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
         * 
         * @return builder
         * 
         */
        public Builder imports(List<ImportFileArgs> imports) {
            return imports(Output.of(imports));
        }

        /**
         * @param imports Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
         * 
         * @return builder
         * 
         */
        public Builder imports(ImportFileArgs... imports) {
            return imports(List.of(imports));
        }

        public TargetConfigurationArgs build() {
            return $;
        }
    }

}
