// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.secretmanager_v1.outputs.ReplicationResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.RotationResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.TopicResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSecretResult {
    /**
     * The time at which the Secret was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Etag of the currently stored Secret.
     * 
     */
    private final String etag;
    /**
     * Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    private final String expireTime;
    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the Secret in the format `projects/*{@literal /}secrets/*`.
     * 
     */
    private final String name;
    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    private final ReplicationResponse replication;
    /**
     * Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    private final RotationResponse rotation;
    /**
     * Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    private final List<TopicResponse> topics;
    /**
     * Input only. The TTL for the Secret.
     * 
     */
    private final String ttl;

    @OutputCustomType.Constructor({"createTime","etag","expireTime","labels","name","replication","rotation","topics","ttl"})
    private GetSecretResult(
        String createTime,
        String etag,
        String expireTime,
        Map<String,String> labels,
        String name,
        ReplicationResponse replication,
        RotationResponse rotation,
        List<TopicResponse> topics,
        String ttl) {
        this.createTime = Objects.requireNonNull(createTime);
        this.etag = Objects.requireNonNull(etag);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.replication = Objects.requireNonNull(replication);
        this.rotation = Objects.requireNonNull(rotation);
        this.topics = Objects.requireNonNull(topics);
        this.ttl = Objects.requireNonNull(ttl);
    }

    /**
     * The time at which the Secret was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Etag of the currently stored Secret.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the Secret in the format `projects/*{@literal /}secrets/*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    public ReplicationResponse getReplication() {
        return this.replication;
    }
    /**
     * Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    public RotationResponse getRotation() {
        return this.rotation;
    }
    /**
     * Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    public List<TopicResponse> getTopics() {
        return this.topics;
    }
    /**
     * Input only. The TTL for the Secret.
     * 
     */
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
        private String etag;
        private String expireTime;
        private Map<String,String> labels;
        private String name;
        private ReplicationResponse replication;
        private RotationResponse rotation;
        private List<TopicResponse> topics;
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.etag = defaults.etag;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.replication = defaults.replication;
    	      this.rotation = defaults.rotation;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReplication(ReplicationResponse replication) {
            this.replication = Objects.requireNonNull(replication);
            return this;
        }

        public Builder setRotation(RotationResponse rotation) {
            this.rotation = Objects.requireNonNull(rotation);
            return this;
        }

        public Builder setTopics(List<TopicResponse> topics) {
            this.topics = Objects.requireNonNull(topics);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public GetSecretResult build() {
            return new GetSecretResult(createTime, etag, expireTime, labels, name, replication, rotation, topics, ttl);
        }
    }
}
