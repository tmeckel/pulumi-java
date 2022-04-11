// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom action to be executed
 * when an auto heal rule is triggered.
 * 
 */
public final class AutoHealCustomActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoHealCustomActionArgs Empty = new AutoHealCustomActionArgs();

    /**
     * Executable to be run.
     * 
     */
    @Import(name="exe")
      private final @Nullable Output<String> exe;

    public Output<String> getExe() {
        return this.exe == null ? Codegen.empty() : this.exe;
    }

    /**
     * Parameters for the executable.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<String> parameters;

    public Output<String> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    public AutoHealCustomActionArgs(
        @Nullable Output<String> exe,
        @Nullable Output<String> parameters) {
        this.exe = exe;
        this.parameters = parameters;
    }

    private AutoHealCustomActionArgs() {
        this.exe = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exe;
        private @Nullable Output<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealCustomActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exe = defaults.exe;
    	      this.parameters = defaults.parameters;
        }

        public Builder exe(@Nullable Output<String> exe) {
            this.exe = exe;
            return this;
        }
        public Builder exe(@Nullable String exe) {
            this.exe = Codegen.ofNullable(exe);
            return this;
        }
        public Builder parameters(@Nullable Output<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }        public AutoHealCustomActionArgs build() {
            return new AutoHealCustomActionArgs(exe, parameters);
        }
    }
}
