// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.storage.inputs.ObjectAccessControlProjectTeamGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectAccessControlState extends io.pulumi.resources.ResourceArgs {

    public static final ObjectAccessControlState Empty = new ObjectAccessControlState();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * The domain associated with the entity.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * The email address associated with the entity.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as "user-liz@example.com")
     * * group-{{groupId}}
     * * group-{{email}} (such as "group-example@googlegroups.com")
     * * domain-{{domain}} (such as "domain-example.com")
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @Import(name="entity")
      private final @Nullable Output<String> entity;

    public Output<String> getEntity() {
        return this.entity == null ? Codegen.empty() : this.entity;
    }

    /**
     * The ID for the entity
     * 
     */
    @Import(name="entityId")
      private final @Nullable Output<String> entityId;

    public Output<String> getEntityId() {
        return this.entityId == null ? Codegen.empty() : this.entityId;
    }

    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<Integer> generation;

    public Output<Integer> getGeneration() {
        return this.generation == null ? Codegen.empty() : this.generation;
    }

    /**
     * The name of the object to apply the access control to.
     * 
     */
    @Import(name="object")
      private final @Nullable Output<String> object;

    public Output<String> getObject() {
        return this.object == null ? Codegen.empty() : this.object;
    }

    /**
     * The project team associated with the entity
     * 
     */
    @Import(name="projectTeams")
      private final @Nullable Output<List<ObjectAccessControlProjectTeamGetArgs>> projectTeams;

    public Output<List<ObjectAccessControlProjectTeamGetArgs>> getProjectTeams() {
        return this.projectTeams == null ? Codegen.empty() : this.projectTeams;
    }

    /**
     * The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public ObjectAccessControlState(
        @Nullable Output<String> bucket,
        @Nullable Output<String> domain,
        @Nullable Output<String> email,
        @Nullable Output<String> entity,
        @Nullable Output<String> entityId,
        @Nullable Output<Integer> generation,
        @Nullable Output<String> object,
        @Nullable Output<List<ObjectAccessControlProjectTeamGetArgs>> projectTeams,
        @Nullable Output<String> role) {
        this.bucket = bucket;
        this.domain = domain;
        this.email = email;
        this.entity = entity;
        this.entityId = entityId;
        this.generation = generation;
        this.object = object;
        this.projectTeams = projectTeams;
        this.role = role;
    }

    private ObjectAccessControlState() {
        this.bucket = Codegen.empty();
        this.domain = Codegen.empty();
        this.email = Codegen.empty();
        this.entity = Codegen.empty();
        this.entityId = Codegen.empty();
        this.generation = Codegen.empty();
        this.object = Codegen.empty();
        this.projectTeams = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> email;
        private @Nullable Output<String> entity;
        private @Nullable Output<String> entityId;
        private @Nullable Output<Integer> generation;
        private @Nullable Output<String> object;
        private @Nullable Output<List<ObjectAccessControlProjectTeamGetArgs>> projectTeams;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
    	      this.projectTeams = defaults.projectTeams;
    	      this.role = defaults.role;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder entity(@Nullable Output<String> entity) {
            this.entity = entity;
            return this;
        }
        public Builder entity(@Nullable String entity) {
            this.entity = Codegen.ofNullable(entity);
            return this;
        }
        public Builder entityId(@Nullable Output<String> entityId) {
            this.entityId = entityId;
            return this;
        }
        public Builder entityId(@Nullable String entityId) {
            this.entityId = Codegen.ofNullable(entityId);
            return this;
        }
        public Builder generation(@Nullable Output<Integer> generation) {
            this.generation = generation;
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = Codegen.ofNullable(generation);
            return this;
        }
        public Builder object(@Nullable Output<String> object) {
            this.object = object;
            return this;
        }
        public Builder object(@Nullable String object) {
            this.object = Codegen.ofNullable(object);
            return this;
        }
        public Builder projectTeams(@Nullable Output<List<ObjectAccessControlProjectTeamGetArgs>> projectTeams) {
            this.projectTeams = projectTeams;
            return this;
        }
        public Builder projectTeams(@Nullable List<ObjectAccessControlProjectTeamGetArgs> projectTeams) {
            this.projectTeams = Codegen.ofNullable(projectTeams);
            return this;
        }
        public Builder projectTeams(ObjectAccessControlProjectTeamGetArgs... projectTeams) {
            return projectTeams(List.of(projectTeams));
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public ObjectAccessControlState build() {
            return new ObjectAccessControlState(bucket, domain, email, entity, entityId, generation, object, projectTeams, role);
        }
    }
}
