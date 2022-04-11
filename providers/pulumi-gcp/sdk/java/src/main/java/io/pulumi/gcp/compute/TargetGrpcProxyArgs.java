// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGrpcProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetGrpcProxyArgs Empty = new TargetGrpcProxyArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource
     * is created. The name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long
     * and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * URL to the UrlMap resource that defines the mapping from URL to
     * the BackendService. The protocol field in the BackendService
     * must be set to GRPC.
     * 
     */
    @Import(name="urlMap")
      private final @Nullable Output<String> urlMap;

    public Output<String> getUrlMap() {
        return this.urlMap == null ? Codegen.empty() : this.urlMap;
    }

    /**
     * If true, indicates that the BackendServices referenced by
     * the urlMap may be accessed by gRPC applications without using
     * a sidecar proxy. This will enable configuration checks on urlMap
     * and its referenced BackendServices to not allow unsupported features.
     * A gRPC application must use "xds:///" scheme in the target URI
     * of the service it is connecting to. If false, indicates that the
     * BackendServices referenced by the urlMap will be accessed by gRPC
     * applications via a sidecar proxy. In this case, a gRPC application
     * must not use "xds:///" scheme in the target URI of the service
     * it is connecting to
     * 
     */
    @Import(name="validateForProxyless")
      private final @Nullable Output<Boolean> validateForProxyless;

    public Output<Boolean> getValidateForProxyless() {
        return this.validateForProxyless == null ? Codegen.empty() : this.validateForProxyless;
    }

    public TargetGrpcProxyArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> urlMap,
        @Nullable Output<Boolean> validateForProxyless) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.urlMap = urlMap;
        this.validateForProxyless = validateForProxyless;
    }

    private TargetGrpcProxyArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.urlMap = Codegen.empty();
        this.validateForProxyless = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGrpcProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> urlMap;
        private @Nullable Output<Boolean> validateForProxyless;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGrpcProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.urlMap = defaults.urlMap;
    	      this.validateForProxyless = defaults.validateForProxyless;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder urlMap(@Nullable Output<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }
        public Builder urlMap(@Nullable String urlMap) {
            this.urlMap = Codegen.ofNullable(urlMap);
            return this;
        }
        public Builder validateForProxyless(@Nullable Output<Boolean> validateForProxyless) {
            this.validateForProxyless = validateForProxyless;
            return this;
        }
        public Builder validateForProxyless(@Nullable Boolean validateForProxyless) {
            this.validateForProxyless = Codegen.ofNullable(validateForProxyless);
            return this;
        }        public TargetGrpcProxyArgs build() {
            return new TargetGrpcProxyArgs(description, name, project, urlMap, validateForProxyless);
        }
    }
}
