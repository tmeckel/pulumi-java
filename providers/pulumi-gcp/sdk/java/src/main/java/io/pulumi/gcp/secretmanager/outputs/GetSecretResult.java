// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.secretmanager.outputs.GetSecretReplication;
import io.pulumi.gcp.secretmanager.outputs.GetSecretRotation;
import io.pulumi.gcp.secretmanager.outputs.GetSecretTopic;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSecretResult {
    private final String createTime;
    private final String expireTime;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final String name;
    private final @Nullable String project;
    private final List<GetSecretReplication> replications;
    private final List<GetSecretRotation> rotations;
    private final String secretId;
    private final List<GetSecretTopic> topics;
    private final String ttl;

    @OutputCustomType.Constructor
    private GetSecretResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("expireTime") String expireTime,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") @Nullable String project,
        @OutputCustomType.Parameter("replications") List<GetSecretReplication> replications,
        @OutputCustomType.Parameter("rotations") List<GetSecretRotation> rotations,
        @OutputCustomType.Parameter("secretId") String secretId,
        @OutputCustomType.Parameter("topics") List<GetSecretTopic> topics,
        @OutputCustomType.Parameter("ttl") String ttl) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.replications = replications;
        this.rotations = rotations;
        this.secretId = secretId;
        this.topics = topics;
        this.ttl = ttl;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public List<GetSecretReplication> getReplications() {
        return this.replications;
    }
    public List<GetSecretRotation> getRotations() {
        return this.rotations;
    }
    public String getSecretId() {
        return this.secretId;
    }
    public List<GetSecretTopic> getTopics() {
        return this.topics;
    }
    public String getTtl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private String id;
        private Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private List<GetSecretReplication> replications;
        private List<GetSecretRotation> rotations;
        private String secretId;
        private List<GetSecretTopic> topics;
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.replications = defaults.replications;
    	      this.rotations = defaults.rotations;
    	      this.secretId = defaults.secretId;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder replications(List<GetSecretReplication> replications) {
            this.replications = Objects.requireNonNull(replications);
            return this;
        }

        public Builder rotations(List<GetSecretRotation> rotations) {
            this.rotations = Objects.requireNonNull(rotations);
            return this;
        }

        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder topics(List<GetSecretTopic> topics) {
            this.topics = Objects.requireNonNull(topics);
            return this;
        }

        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public GetSecretResult build() {
            return new GetSecretResult(createTime, expireTime, id, labels, name, project, replications, rotations, secretId, topics, ttl);
        }
    }
}
