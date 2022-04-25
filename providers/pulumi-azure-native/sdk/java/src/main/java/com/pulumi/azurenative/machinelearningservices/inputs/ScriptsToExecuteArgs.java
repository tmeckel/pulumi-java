// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ScriptReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customized setup scripts
 * 
 */
public final class ScriptsToExecuteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScriptsToExecuteArgs Empty = new ScriptsToExecuteArgs();

    /**
     * Script that&#39;s run only once during provision of the compute.
     * 
     */
    @Import(name="creationScript")
    private @Nullable Output<ScriptReferenceArgs> creationScript;

    /**
     * @return Script that&#39;s run only once during provision of the compute.
     * 
     */
    public Optional<Output<ScriptReferenceArgs>> creationScript() {
        return Optional.ofNullable(this.creationScript);
    }

    /**
     * Script that&#39;s run every time the machine starts.
     * 
     */
    @Import(name="startupScript")
    private @Nullable Output<ScriptReferenceArgs> startupScript;

    /**
     * @return Script that&#39;s run every time the machine starts.
     * 
     */
    public Optional<Output<ScriptReferenceArgs>> startupScript() {
        return Optional.ofNullable(this.startupScript);
    }

    private ScriptsToExecuteArgs() {}

    private ScriptsToExecuteArgs(ScriptsToExecuteArgs $) {
        this.creationScript = $.creationScript;
        this.startupScript = $.startupScript;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptsToExecuteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptsToExecuteArgs $;

        public Builder() {
            $ = new ScriptsToExecuteArgs();
        }

        public Builder(ScriptsToExecuteArgs defaults) {
            $ = new ScriptsToExecuteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationScript Script that&#39;s run only once during provision of the compute.
         * 
         * @return builder
         * 
         */
        public Builder creationScript(@Nullable Output<ScriptReferenceArgs> creationScript) {
            $.creationScript = creationScript;
            return this;
        }

        /**
         * @param creationScript Script that&#39;s run only once during provision of the compute.
         * 
         * @return builder
         * 
         */
        public Builder creationScript(ScriptReferenceArgs creationScript) {
            return creationScript(Output.of(creationScript));
        }

        /**
         * @param startupScript Script that&#39;s run every time the machine starts.
         * 
         * @return builder
         * 
         */
        public Builder startupScript(@Nullable Output<ScriptReferenceArgs> startupScript) {
            $.startupScript = startupScript;
            return this;
        }

        /**
         * @param startupScript Script that&#39;s run every time the machine starts.
         * 
         * @return builder
         * 
         */
        public Builder startupScript(ScriptReferenceArgs startupScript) {
            return startupScript(Output.of(startupScript));
        }

        public ScriptsToExecuteArgs build() {
            return $;
        }
    }

}
