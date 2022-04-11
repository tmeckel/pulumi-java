// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 * 
 */
public final class NonResourceAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonResourceAttributesArgs Empty = new NonResourceAttributesArgs();

    /**
     * Path is the URL path of the request
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Verb is the standard HTTP verb
     * 
     */
    @Import(name="verb")
      private final @Nullable Output<String> verb;

    public Output<String> getVerb() {
        return this.verb == null ? Codegen.empty() : this.verb;
    }

    public NonResourceAttributesArgs(
        @Nullable Output<String> path,
        @Nullable Output<String> verb) {
        this.path = path;
        this.verb = verb;
    }

    private NonResourceAttributesArgs() {
        this.path = Codegen.empty();
        this.verb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourceAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> path;
        private @Nullable Output<String> verb;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourceAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.verb = defaults.verb;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder verb(@Nullable Output<String> verb) {
            this.verb = verb;
            return this;
        }
        public Builder verb(@Nullable String verb) {
            this.verb = Codegen.ofNullable(verb);
            return this;
        }        public NonResourceAttributesArgs build() {
            return new NonResourceAttributesArgs(path, verb);
        }
    }
}
