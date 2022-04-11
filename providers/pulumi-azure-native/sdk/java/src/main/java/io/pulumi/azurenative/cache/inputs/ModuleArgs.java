// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies configuration of a redis module
 * 
 */
public final class ModuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleArgs Empty = new ModuleArgs();

    /**
     * Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE 400'.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<String> args;

    public Output<String> getArgs() {
        return this.args == null ? Codegen.empty() : this.args;
    }

    /**
     * The name of the module, e.g. 'RedisBloom', 'RediSearch', 'RedisTimeSeries'
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ModuleArgs(
        @Nullable Output<String> args,
        Output<String> name) {
        this.args = args;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ModuleArgs() {
        this.args = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> args;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.name = defaults.name;
        }

        public Builder args(@Nullable Output<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable String args) {
            this.args = Codegen.ofNullable(args);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ModuleArgs build() {
            return new ModuleArgs(args, name);
        }
    }
}
