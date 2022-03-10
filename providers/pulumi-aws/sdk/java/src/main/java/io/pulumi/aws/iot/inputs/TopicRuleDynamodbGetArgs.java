// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDynamodbGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDynamodbGetArgs Empty = new TopicRuleDynamodbGetArgs();

    /**
     * The hash key name.
     * 
     */
    @InputImport(name="hashKeyField", required=true)
      private final Input<String> hashKeyField;

    public Input<String> getHashKeyField() {
        return this.hashKeyField;
    }

    /**
     * The hash key type. Valid values are "STRING" or "NUMBER".
     * 
     */
    @InputImport(name="hashKeyType")
      private final @Nullable Input<String> hashKeyType;

    public Input<String> getHashKeyType() {
        return this.hashKeyType == null ? Input.empty() : this.hashKeyType;
    }

    /**
     * The hash key value.
     * 
     */
    @InputImport(name="hashKeyValue", required=true)
      private final Input<String> hashKeyValue;

    public Input<String> getHashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
     * 
     */
    @InputImport(name="operation")
      private final @Nullable Input<String> operation;

    public Input<String> getOperation() {
        return this.operation == null ? Input.empty() : this.operation;
    }

    /**
     * The action payload.
     * 
     */
    @InputImport(name="payloadField")
      private final @Nullable Input<String> payloadField;

    public Input<String> getPayloadField() {
        return this.payloadField == null ? Input.empty() : this.payloadField;
    }

    /**
     * The range key name.
     * 
     */
    @InputImport(name="rangeKeyField")
      private final @Nullable Input<String> rangeKeyField;

    public Input<String> getRangeKeyField() {
        return this.rangeKeyField == null ? Input.empty() : this.rangeKeyField;
    }

    /**
     * The range key type. Valid values are "STRING" or "NUMBER".
     * 
     */
    @InputImport(name="rangeKeyType")
      private final @Nullable Input<String> rangeKeyType;

    public Input<String> getRangeKeyType() {
        return this.rangeKeyType == null ? Input.empty() : this.rangeKeyType;
    }

    /**
     * The range key value.
     * 
     */
    @InputImport(name="rangeKeyValue")
      private final @Nullable Input<String> rangeKeyValue;

    public Input<String> getRangeKeyValue() {
        return this.rangeKeyValue == null ? Input.empty() : this.rangeKeyValue;
    }

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public TopicRuleDynamodbGetArgs(
        Input<String> hashKeyField,
        @Nullable Input<String> hashKeyType,
        Input<String> hashKeyValue,
        @Nullable Input<String> operation,
        @Nullable Input<String> payloadField,
        @Nullable Input<String> rangeKeyField,
        @Nullable Input<String> rangeKeyType,
        @Nullable Input<String> rangeKeyValue,
        Input<String> roleArn,
        Input<String> tableName) {
        this.hashKeyField = Objects.requireNonNull(hashKeyField, "expected parameter 'hashKeyField' to be non-null");
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = Objects.requireNonNull(hashKeyValue, "expected parameter 'hashKeyValue' to be non-null");
        this.operation = operation;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private TopicRuleDynamodbGetArgs() {
        this.hashKeyField = Input.empty();
        this.hashKeyType = Input.empty();
        this.hashKeyValue = Input.empty();
        this.operation = Input.empty();
        this.payloadField = Input.empty();
        this.rangeKeyField = Input.empty();
        this.rangeKeyType = Input.empty();
        this.rangeKeyValue = Input.empty();
        this.roleArn = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodbGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hashKeyField;
        private @Nullable Input<String> hashKeyType;
        private Input<String> hashKeyValue;
        private @Nullable Input<String> operation;
        private @Nullable Input<String> payloadField;
        private @Nullable Input<String> rangeKeyField;
        private @Nullable Input<String> rangeKeyType;
        private @Nullable Input<String> rangeKeyValue;
        private Input<String> roleArn;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamodbGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder hashKeyField(Input<String> hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }

        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Input.of(Objects.requireNonNull(hashKeyField));
            return this;
        }

        public Builder hashKeyType(@Nullable Input<String> hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = Input.ofNullable(hashKeyType);
            return this;
        }

        public Builder hashKeyValue(Input<String> hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }

        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Input.of(Objects.requireNonNull(hashKeyValue));
            return this;
        }

        public Builder operation(@Nullable Input<String> operation) {
            this.operation = operation;
            return this;
        }

        public Builder operation(@Nullable String operation) {
            this.operation = Input.ofNullable(operation);
            return this;
        }

        public Builder payloadField(@Nullable Input<String> payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = Input.ofNullable(payloadField);
            return this;
        }

        public Builder rangeKeyField(@Nullable Input<String> rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = Input.ofNullable(rangeKeyField);
            return this;
        }

        public Builder rangeKeyType(@Nullable Input<String> rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = Input.ofNullable(rangeKeyType);
            return this;
        }

        public Builder rangeKeyValue(@Nullable Input<String> rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = Input.ofNullable(rangeKeyValue);
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder tableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }
        public TopicRuleDynamodbGetArgs build() {
            return new TopicRuleDynamodbGetArgs(hashKeyField, hashKeyType, hashKeyValue, operation, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, roleArn, tableName);
        }
    }
}
