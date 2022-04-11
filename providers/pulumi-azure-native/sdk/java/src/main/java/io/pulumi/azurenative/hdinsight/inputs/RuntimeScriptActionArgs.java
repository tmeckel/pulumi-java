// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a script action on a running cluster.
 * 
 */
public final class RuntimeScriptActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeScriptActionArgs Empty = new RuntimeScriptActionArgs();

    /**
     * The name of the script action.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The parameters for the script
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<String> parameters;

    public Output<String> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The list of roles where script will be executed.
     * 
     */
    @Import(name="roles", required=true)
      private final Output<List<String>> roles;

    public Output<List<String>> getRoles() {
        return this.roles;
    }

    /**
     * The URI to the script.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    public RuntimeScriptActionArgs(
        Output<String> name,
        @Nullable Output<String> parameters,
        Output<List<String>> roles,
        Output<String> uri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RuntimeScriptActionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
        this.roles = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeScriptActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<String> parameters;
        private Output<List<String>> roles;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeScriptActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.roles = defaults.roles;
    	      this.uri = defaults.uri;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(@Nullable Output<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder roles(Output<List<String>> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(List<String> roles) {
            this.roles = Output.of(Objects.requireNonNull(roles));
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }        public RuntimeScriptActionArgs build() {
            return new RuntimeScriptActionArgs(name, parameters, roles, uri);
        }
    }
}
