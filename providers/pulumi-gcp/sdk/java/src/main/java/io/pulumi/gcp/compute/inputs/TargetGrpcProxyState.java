// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGrpcProxyState extends io.pulumi.resources.ResourceArgs {

    public static final TargetGrpcProxyState Empty = new TargetGrpcProxyState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Codegen.empty() : this.creationTimestamp;
    }

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
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * This field will be ignored when inserting a TargetGrpcProxy. An up-to-date fingerprint must be provided in order to
     * patch/update the TargetGrpcProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest
     * fingerprint, make a get() request to retrieve the TargetGrpcProxy. A base64-encoded string.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Codegen.empty() : this.fingerprint;
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
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * Server-defined URL with id for the resource.
     * 
     */
    @Import(name="selfLinkWithId")
      private final @Nullable Output<String> selfLinkWithId;

    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId == null ? Codegen.empty() : this.selfLinkWithId;
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

    public TargetGrpcProxyState(
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> selfLinkWithId,
        @Nullable Output<String> urlMap,
        @Nullable Output<Boolean> validateForProxyless) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.urlMap = urlMap;
        this.validateForProxyless = validateForProxyless;
    }

    private TargetGrpcProxyState() {
        this.creationTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.fingerprint = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.selfLinkWithId = Codegen.empty();
        this.urlMap = Codegen.empty();
        this.validateForProxyless = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGrpcProxyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> selfLinkWithId;
        private @Nullable Output<String> urlMap;
        private @Nullable Output<Boolean> validateForProxyless;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGrpcProxyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.urlMap = defaults.urlMap;
    	      this.validateForProxyless = defaults.validateForProxyless;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Codegen.ofNullable(creationTimestamp);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Codegen.ofNullable(fingerprint);
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
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder selfLinkWithId(@Nullable Output<String> selfLinkWithId) {
            this.selfLinkWithId = selfLinkWithId;
            return this;
        }
        public Builder selfLinkWithId(@Nullable String selfLinkWithId) {
            this.selfLinkWithId = Codegen.ofNullable(selfLinkWithId);
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
        }        public TargetGrpcProxyState build() {
            return new TargetGrpcProxyState(creationTimestamp, description, fingerprint, name, project, selfLink, selfLinkWithId, urlMap, validateForProxyless);
        }
    }
}
