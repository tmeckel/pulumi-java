// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentSettingArgs Empty = new EnvironmentSettingArgs();

    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    @Import(name="resource")
      private final @Nullable Output<String> resource;

    public Output<String> getResource() {
        return this.resource == null ? Codegen.empty() : this.resource;
    }

    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public EnvironmentSettingArgs(
        Output<String> name,
        Output<String> namespace,
        @Nullable Output<String> resource,
        Output<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.resource = resource;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EnvironmentSettingArgs() {
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
        this.resource = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> namespace;
        private @Nullable Output<String> resource;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.value = defaults.value;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public Builder resource(@Nullable Output<String> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = Codegen.ofNullable(resource);
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public EnvironmentSettingArgs build() {
            return new EnvironmentSettingArgs(name, namespace, resource, value);
        }
    }
}
