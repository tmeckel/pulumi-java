// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemAssociationState Empty = new FileSystemAssociationState();

    /**
     * Amazon Resource Name (ARN) of the newly created file system association.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * 
     */
    @Import(name="auditDestinationArn")
      private final @Nullable Output<String> auditDestinationArn;

    public Output<String> getAuditDestinationArn() {
        return this.auditDestinationArn == null ? Codegen.empty() : this.auditDestinationArn;
    }

    /**
     * Refresh cache information. see Cache Attributes for more details.
     * 
     */
    @Import(name="cacheAttributes")
      private final @Nullable Output<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes;

    public Output<FileSystemAssociationCacheAttributesGetArgs> getCacheAttributes() {
        return this.cacheAttributes == null ? Codegen.empty() : this.cacheAttributes;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn")
      private final @Nullable Output<String> gatewayArn;

    public Output<String> getGatewayArn() {
        return this.gatewayArn == null ? Codegen.empty() : this.gatewayArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * 
     */
    @Import(name="locationArn")
      private final @Nullable Output<String> locationArn;

    public Output<String> getLocationArn() {
        return this.locationArn == null ? Codegen.empty() : this.locationArn;
    }

    /**
     * The password of the user credential.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public FileSystemAssociationState(
        @Nullable Output<String> arn,
        @Nullable Output<String> auditDestinationArn,
        @Nullable Output<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes,
        @Nullable Output<String> gatewayArn,
        @Nullable Output<String> locationArn,
        @Nullable Output<String> password,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> username) {
        this.arn = arn;
        this.auditDestinationArn = auditDestinationArn;
        this.cacheAttributes = cacheAttributes;
        this.gatewayArn = gatewayArn;
        this.locationArn = locationArn;
        this.password = password;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.username = username;
    }

    private FileSystemAssociationState() {
        this.arn = Codegen.empty();
        this.auditDestinationArn = Codegen.empty();
        this.cacheAttributes = Codegen.empty();
        this.gatewayArn = Codegen.empty();
        this.locationArn = Codegen.empty();
        this.password = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> auditDestinationArn;
        private @Nullable Output<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes;
        private @Nullable Output<String> gatewayArn;
        private @Nullable Output<String> locationArn;
        private @Nullable Output<String> password;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auditDestinationArn = defaults.auditDestinationArn;
    	      this.cacheAttributes = defaults.cacheAttributes;
    	      this.gatewayArn = defaults.gatewayArn;
    	      this.locationArn = defaults.locationArn;
    	      this.password = defaults.password;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.username = defaults.username;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder auditDestinationArn(@Nullable Output<String> auditDestinationArn) {
            this.auditDestinationArn = auditDestinationArn;
            return this;
        }
        public Builder auditDestinationArn(@Nullable String auditDestinationArn) {
            this.auditDestinationArn = Codegen.ofNullable(auditDestinationArn);
            return this;
        }
        public Builder cacheAttributes(@Nullable Output<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes) {
            this.cacheAttributes = cacheAttributes;
            return this;
        }
        public Builder cacheAttributes(@Nullable FileSystemAssociationCacheAttributesGetArgs cacheAttributes) {
            this.cacheAttributes = Codegen.ofNullable(cacheAttributes);
            return this;
        }
        public Builder gatewayArn(@Nullable Output<String> gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }
        public Builder gatewayArn(@Nullable String gatewayArn) {
            this.gatewayArn = Codegen.ofNullable(gatewayArn);
            return this;
        }
        public Builder locationArn(@Nullable Output<String> locationArn) {
            this.locationArn = locationArn;
            return this;
        }
        public Builder locationArn(@Nullable String locationArn) {
            this.locationArn = Codegen.ofNullable(locationArn);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public FileSystemAssociationState build() {
            return new FileSystemAssociationState(arn, auditDestinationArn, cacheAttributes, gatewayArn, locationArn, password, tags, tagsAll, username);
        }
    }
}
