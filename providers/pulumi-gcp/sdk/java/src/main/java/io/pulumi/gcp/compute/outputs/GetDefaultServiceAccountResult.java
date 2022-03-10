// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDefaultServiceAccountResult {
    /**
     * The display name for the service account.
     * 
     */
    private final String displayName;
    /**
     * Email address of the default service account used by VMs running in this project
     * 
     */
    private final String email;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The fully-qualified name of the service account.
     * 
     */
    private final String name;
    private final String project;
    /**
     * The unique id of the service account.
     * 
     */
    private final String uniqueId;

    @OutputCustomType.Constructor
    private GetDefaultServiceAccountResult(
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("email") String email,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") String project,
        @OutputCustomType.Parameter("uniqueId") String uniqueId) {
        this.displayName = displayName;
        this.email = email;
        this.id = id;
        this.name = name;
        this.project = project;
        this.uniqueId = uniqueId;
    }

    /**
     * The display name for the service account.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Email address of the default service account used by VMs running in this project
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The fully-qualified name of the service account.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }
    /**
     * The unique id of the service account.
     * 
    */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String email;
        private String id;
        private String name;
        private String project;
        private String uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }
        public GetDefaultServiceAccountResult build() {
            return new GetDefaultServiceAccountResult(displayName, email, id, name, project, uniqueId);
        }
    }
}
