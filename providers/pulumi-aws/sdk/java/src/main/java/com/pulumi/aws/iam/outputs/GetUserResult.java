// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetUserResult {
    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS for this user.
     * 
     */
    private final String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Path in which this user was created.
     * 
     */
    private final String path;
    /**
     * @return The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    private final String permissionsBoundary;
    /**
     * @return Map of key-value pairs associated with the user.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The unique ID assigned by AWS for this user.
     * 
     */
    private final String userId;
    /**
     * @return The name associated to this User
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("permissionsBoundary") String permissionsBoundary,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("userName") String userName) {
        this.arn = arn;
        this.id = id;
        this.path = path;
        this.permissionsBoundary = permissionsBoundary;
        this.tags = tags;
        this.userId = userId;
        this.userName = userName;
    }

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS for this user.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Path in which this user was created.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    public String permissionsBoundary() {
        return this.permissionsBoundary;
    }
    /**
     * @return Map of key-value pairs associated with the user.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The unique ID assigned by AWS for this user.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The name associated to this User
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String path;
        private String permissionsBoundary;
        private Map<String,String> tags;
        private String userId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.permissionsBoundary = defaults.permissionsBoundary;
    	      this.tags = defaults.tags;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder permissionsBoundary(String permissionsBoundary) {
            this.permissionsBoundary = Objects.requireNonNull(permissionsBoundary);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(arn, id, path, permissionsBoundary, tags, userId, userName);
        }
    }
}
