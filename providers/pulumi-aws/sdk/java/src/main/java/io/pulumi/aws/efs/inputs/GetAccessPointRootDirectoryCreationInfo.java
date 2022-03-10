// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointRootDirectoryCreationInfo extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPointRootDirectoryCreationInfo Empty = new GetAccessPointRootDirectoryCreationInfo();

    /**
     * POSIX owner group ID
     * 
     */
    @InputImport(name="ownerGid", required=true)
      private final Integer ownerGid;

    public Integer getOwnerGid() {
        return this.ownerGid;
    }

    /**
     * POSIX owner user ID
     * 
     */
    @InputImport(name="ownerUid", required=true)
      private final Integer ownerUid;

    public Integer getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * POSIX permissions mode
     * 
     */
    @InputImport(name="permissions", required=true)
      private final String permissions;

    public String getPermissions() {
        return this.permissions;
    }

    public GetAccessPointRootDirectoryCreationInfo(
        Integer ownerGid,
        Integer ownerUid,
        String permissions) {
        this.ownerGid = Objects.requireNonNull(ownerGid, "expected parameter 'ownerGid' to be non-null");
        this.ownerUid = Objects.requireNonNull(ownerUid, "expected parameter 'ownerUid' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
    }

    private GetAccessPointRootDirectoryCreationInfo() {
        this.ownerGid = null;
        this.ownerUid = null;
        this.permissions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointRootDirectoryCreationInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer ownerGid;
        private Integer ownerUid;
        private String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointRootDirectoryCreationInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        public Builder ownerGid(Integer ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }

        public Builder ownerUid(Integer ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }

        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public GetAccessPointRootDirectoryCreationInfo build() {
            return new GetAccessPointRootDirectoryCreationInfo(ownerGid, ownerUid, permissions);
        }
    }
}
