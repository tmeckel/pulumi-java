// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectCopyGrantArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectCopyGrantArgs Empty = new ObjectCopyGrantArgs();

    /**
     * Email address of the grantee. Used only when `type` is `AmazonCustomerByEmail`.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * The canonical user ID of the grantee. Used only when `type` is `CanonicalUser`.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * List of permissions to grant to grantee. Valid values are `READ`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
     * 
     */
    @Import(name="permissions", required=true)
      private final Output<List<String>> permissions;

    public Output<List<String>> getPermissions() {
        return this.permissions;
    }

    /**
     * - Type of grantee. Valid values are `CanonicalUser`, `Group`, and `AmazonCustomerByEmail`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * URI of the grantee group. Used only when `type` is `Group`.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public ObjectCopyGrantArgs(
        @Nullable Output<String> email,
        @Nullable Output<String> id,
        Output<List<String>> permissions,
        Output<String> type,
        @Nullable Output<String> uri) {
        this.email = email;
        this.id = id;
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uri = uri;
    }

    private ObjectCopyGrantArgs() {
        this.email = Codegen.empty();
        this.id = Codegen.empty();
        this.permissions = Codegen.empty();
        this.type = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectCopyGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private @Nullable Output<String> id;
        private Output<List<String>> permissions;
        private Output<String> type;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectCopyGrantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder permissions(Output<List<String>> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(List<String> permissions) {
            this.permissions = Output.of(Objects.requireNonNull(permissions));
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public ObjectCopyGrantArgs build() {
            return new ObjectCopyGrantArgs(email, id, permissions, type, uri);
        }
    }
}
