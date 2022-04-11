// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkEdgeSecurityServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEdgeSecurityServiceArgs Empty = new NetworkEdgeSecurityServiceArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The resource URL for the network edge security service associated with this network edge security service.
     * 
     */
    @Import(name="securityPolicy")
      private final @Nullable Output<String> securityPolicy;

    public Output<String> getSecurityPolicy() {
        return this.securityPolicy == null ? Codegen.empty() : this.securityPolicy;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> getValidateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    public NetworkEdgeSecurityServiceArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<String> securityPolicy,
        @Nullable Output<String> validateOnly) {
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.securityPolicy = securityPolicy;
        this.validateOnly = validateOnly;
    }

    private NetworkEdgeSecurityServiceArgs() {
        this.description = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.securityPolicy = Codegen.empty();
        this.validateOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEdgeSecurityServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> securityPolicy;
        private @Nullable Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEdgeSecurityServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder securityPolicy(@Nullable Output<String> securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public Builder securityPolicy(@Nullable String securityPolicy) {
            this.securityPolicy = Codegen.ofNullable(securityPolicy);
            return this;
        }
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }        public NetworkEdgeSecurityServiceArgs build() {
            return new NetworkEdgeSecurityServiceArgs(description, kind, name, project, region, requestId, securityPolicy, validateOnly);
        }
    }
}
