// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs Empty = new ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs();

    /**
     * An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    @Import(name="accessLevel")
      private final @Nullable Output<String> accessLevel;

    public Output<String> getAccessLevel() {
        return this.accessLevel == null ? Codegen.empty() : this.accessLevel;
    }

    /**
     * A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<String> resource;

    public Output<String> getResource() {
        return this.resource == null ? Codegen.empty() : this.resource;
    }

    public ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs(
        @Nullable Output<String> accessLevel,
        @Nullable Output<String> resource) {
        this.accessLevel = accessLevel;
        this.resource = resource;
    }

    private ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs() {
        this.accessLevel = Codegen.empty();
        this.resource = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessLevel;
        private @Nullable Output<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.resource = defaults.resource;
        }

        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Builder accessLevel(@Nullable String accessLevel) {
            this.accessLevel = Codegen.ofNullable(accessLevel);
            return this;
        }
        public Builder resource(@Nullable Output<String> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = Codegen.ofNullable(resource);
            return this;
        }        public ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs build() {
            return new ServicePerimeterSpecIngressPolicyIngressFromSourceGetArgs(accessLevel, resource);
        }
    }
}
