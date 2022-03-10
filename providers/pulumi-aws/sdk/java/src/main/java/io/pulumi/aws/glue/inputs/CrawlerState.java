// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.CrawlerCatalogTargetGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerDeltaTargetGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerDynamodbTargetGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerJdbcTargetGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerLineageConfigurationGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerMongodbTargetGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerS3TargetGetArgs;
import io.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerState extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerState Empty = new CrawlerState();

    /**
     * The ARN of the crawler
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    @InputImport(name="catalogTargets")
      private final @Nullable Input<List<CrawlerCatalogTargetGetArgs>> catalogTargets;

    public Input<List<CrawlerCatalogTargetGetArgs>> getCatalogTargets() {
        return this.catalogTargets == null ? Input.empty() : this.catalogTargets;
    }

    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    @InputImport(name="classifiers")
      private final @Nullable Input<List<String>> classifiers;

    public Input<List<String>> getClassifiers() {
        return this.classifiers == null ? Input.empty() : this.classifiers;
    }

    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    @InputImport(name="configuration")
      private final @Nullable Input<String> configuration;

    public Input<String> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    @InputImport(name="deltaTargets")
      private final @Nullable Input<List<CrawlerDeltaTargetGetArgs>> deltaTargets;

    public Input<List<CrawlerDeltaTargetGetArgs>> getDeltaTargets() {
        return this.deltaTargets == null ? Input.empty() : this.deltaTargets;
    }

    /**
     * Description of the crawler.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    @InputImport(name="dynamodbTargets")
      private final @Nullable Input<List<CrawlerDynamodbTargetGetArgs>> dynamodbTargets;

    public Input<List<CrawlerDynamodbTargetGetArgs>> getDynamodbTargets() {
        return this.dynamodbTargets == null ? Input.empty() : this.dynamodbTargets;
    }

    /**
     * List of nested JBDC target arguments. See JDBC Target below.
     * 
     */
    @InputImport(name="jdbcTargets")
      private final @Nullable Input<List<CrawlerJdbcTargetGetArgs>> jdbcTargets;

    public Input<List<CrawlerJdbcTargetGetArgs>> getJdbcTargets() {
        return this.jdbcTargets == null ? Input.empty() : this.jdbcTargets;
    }

    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    @InputImport(name="lineageConfiguration")
      private final @Nullable Input<CrawlerLineageConfigurationGetArgs> lineageConfiguration;

    public Input<CrawlerLineageConfigurationGetArgs> getLineageConfiguration() {
        return this.lineageConfiguration == null ? Input.empty() : this.lineageConfiguration;
    }

    /**
     * List nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    @InputImport(name="mongodbTargets")
      private final @Nullable Input<List<CrawlerMongodbTargetGetArgs>> mongodbTargets;

    public Input<List<CrawlerMongodbTargetGetArgs>> getMongodbTargets() {
        return this.mongodbTargets == null ? Input.empty() : this.mongodbTargets;
    }

    /**
     * Name of the crawler.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    @InputImport(name="recrawlPolicy")
      private final @Nullable Input<CrawlerRecrawlPolicyGetArgs> recrawlPolicy;

    public Input<CrawlerRecrawlPolicyGetArgs> getRecrawlPolicy() {
        return this.recrawlPolicy == null ? Input.empty() : this.recrawlPolicy;
    }

    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * List nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    @InputImport(name="s3Targets")
      private final @Nullable Input<List<CrawlerS3TargetGetArgs>> s3Targets;

    public Input<List<CrawlerS3TargetGetArgs>> getS3Targets() {
        return this.s3Targets == null ? Input.empty() : this.s3Targets;
    }

    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
     * 
     */
    @InputImport(name="schemaChangePolicy")
      private final @Nullable Input<CrawlerSchemaChangePolicyGetArgs> schemaChangePolicy;

    public Input<CrawlerSchemaChangePolicyGetArgs> getSchemaChangePolicy() {
        return this.schemaChangePolicy == null ? Input.empty() : this.schemaChangePolicy;
    }

    /**
     * The name of Security Configuration to be used by the crawler
     * 
     */
    @InputImport(name="securityConfiguration")
      private final @Nullable Input<String> securityConfiguration;

    public Input<String> getSecurityConfiguration() {
        return this.securityConfiguration == null ? Input.empty() : this.securityConfiguration;
    }

    /**
     * The table prefix used for catalog tables that are created.
     * 
     */
    @InputImport(name="tablePrefix")
      private final @Nullable Input<String> tablePrefix;

    public Input<String> getTablePrefix() {
        return this.tablePrefix == null ? Input.empty() : this.tablePrefix;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public CrawlerState(
        @Nullable Input<String> arn,
        @Nullable Input<List<CrawlerCatalogTargetGetArgs>> catalogTargets,
        @Nullable Input<List<String>> classifiers,
        @Nullable Input<String> configuration,
        @Nullable Input<String> databaseName,
        @Nullable Input<List<CrawlerDeltaTargetGetArgs>> deltaTargets,
        @Nullable Input<String> description,
        @Nullable Input<List<CrawlerDynamodbTargetGetArgs>> dynamodbTargets,
        @Nullable Input<List<CrawlerJdbcTargetGetArgs>> jdbcTargets,
        @Nullable Input<CrawlerLineageConfigurationGetArgs> lineageConfiguration,
        @Nullable Input<List<CrawlerMongodbTargetGetArgs>> mongodbTargets,
        @Nullable Input<String> name,
        @Nullable Input<CrawlerRecrawlPolicyGetArgs> recrawlPolicy,
        @Nullable Input<String> role,
        @Nullable Input<List<CrawlerS3TargetGetArgs>> s3Targets,
        @Nullable Input<String> schedule,
        @Nullable Input<CrawlerSchemaChangePolicyGetArgs> schemaChangePolicy,
        @Nullable Input<String> securityConfiguration,
        @Nullable Input<String> tablePrefix,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.catalogTargets = catalogTargets;
        this.classifiers = classifiers;
        this.configuration = configuration;
        this.databaseName = databaseName;
        this.deltaTargets = deltaTargets;
        this.description = description;
        this.dynamodbTargets = dynamodbTargets;
        this.jdbcTargets = jdbcTargets;
        this.lineageConfiguration = lineageConfiguration;
        this.mongodbTargets = mongodbTargets;
        this.name = name;
        this.recrawlPolicy = recrawlPolicy;
        this.role = role;
        this.s3Targets = s3Targets;
        this.schedule = schedule;
        this.schemaChangePolicy = schemaChangePolicy;
        this.securityConfiguration = securityConfiguration;
        this.tablePrefix = tablePrefix;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CrawlerState() {
        this.arn = Input.empty();
        this.catalogTargets = Input.empty();
        this.classifiers = Input.empty();
        this.configuration = Input.empty();
        this.databaseName = Input.empty();
        this.deltaTargets = Input.empty();
        this.description = Input.empty();
        this.dynamodbTargets = Input.empty();
        this.jdbcTargets = Input.empty();
        this.lineageConfiguration = Input.empty();
        this.mongodbTargets = Input.empty();
        this.name = Input.empty();
        this.recrawlPolicy = Input.empty();
        this.role = Input.empty();
        this.s3Targets = Input.empty();
        this.schedule = Input.empty();
        this.schemaChangePolicy = Input.empty();
        this.securityConfiguration = Input.empty();
        this.tablePrefix = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<CrawlerCatalogTargetGetArgs>> catalogTargets;
        private @Nullable Input<List<String>> classifiers;
        private @Nullable Input<String> configuration;
        private @Nullable Input<String> databaseName;
        private @Nullable Input<List<CrawlerDeltaTargetGetArgs>> deltaTargets;
        private @Nullable Input<String> description;
        private @Nullable Input<List<CrawlerDynamodbTargetGetArgs>> dynamodbTargets;
        private @Nullable Input<List<CrawlerJdbcTargetGetArgs>> jdbcTargets;
        private @Nullable Input<CrawlerLineageConfigurationGetArgs> lineageConfiguration;
        private @Nullable Input<List<CrawlerMongodbTargetGetArgs>> mongodbTargets;
        private @Nullable Input<String> name;
        private @Nullable Input<CrawlerRecrawlPolicyGetArgs> recrawlPolicy;
        private @Nullable Input<String> role;
        private @Nullable Input<List<CrawlerS3TargetGetArgs>> s3Targets;
        private @Nullable Input<String> schedule;
        private @Nullable Input<CrawlerSchemaChangePolicyGetArgs> schemaChangePolicy;
        private @Nullable Input<String> securityConfiguration;
        private @Nullable Input<String> tablePrefix;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogTargets = defaults.catalogTargets;
    	      this.classifiers = defaults.classifiers;
    	      this.configuration = defaults.configuration;
    	      this.databaseName = defaults.databaseName;
    	      this.deltaTargets = defaults.deltaTargets;
    	      this.description = defaults.description;
    	      this.dynamodbTargets = defaults.dynamodbTargets;
    	      this.jdbcTargets = defaults.jdbcTargets;
    	      this.lineageConfiguration = defaults.lineageConfiguration;
    	      this.mongodbTargets = defaults.mongodbTargets;
    	      this.name = defaults.name;
    	      this.recrawlPolicy = defaults.recrawlPolicy;
    	      this.role = defaults.role;
    	      this.s3Targets = defaults.s3Targets;
    	      this.schedule = defaults.schedule;
    	      this.schemaChangePolicy = defaults.schemaChangePolicy;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.tablePrefix = defaults.tablePrefix;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder catalogTargets(@Nullable Input<List<CrawlerCatalogTargetGetArgs>> catalogTargets) {
            this.catalogTargets = catalogTargets;
            return this;
        }

        public Builder catalogTargets(@Nullable List<CrawlerCatalogTargetGetArgs> catalogTargets) {
            this.catalogTargets = Input.ofNullable(catalogTargets);
            return this;
        }

        public Builder classifiers(@Nullable Input<List<String>> classifiers) {
            this.classifiers = classifiers;
            return this;
        }

        public Builder classifiers(@Nullable List<String> classifiers) {
            this.classifiers = Input.ofNullable(classifiers);
            return this;
        }

        public Builder configuration(@Nullable Input<String> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(@Nullable String configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder databaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder deltaTargets(@Nullable Input<List<CrawlerDeltaTargetGetArgs>> deltaTargets) {
            this.deltaTargets = deltaTargets;
            return this;
        }

        public Builder deltaTargets(@Nullable List<CrawlerDeltaTargetGetArgs> deltaTargets) {
            this.deltaTargets = Input.ofNullable(deltaTargets);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder dynamodbTargets(@Nullable Input<List<CrawlerDynamodbTargetGetArgs>> dynamodbTargets) {
            this.dynamodbTargets = dynamodbTargets;
            return this;
        }

        public Builder dynamodbTargets(@Nullable List<CrawlerDynamodbTargetGetArgs> dynamodbTargets) {
            this.dynamodbTargets = Input.ofNullable(dynamodbTargets);
            return this;
        }

        public Builder jdbcTargets(@Nullable Input<List<CrawlerJdbcTargetGetArgs>> jdbcTargets) {
            this.jdbcTargets = jdbcTargets;
            return this;
        }

        public Builder jdbcTargets(@Nullable List<CrawlerJdbcTargetGetArgs> jdbcTargets) {
            this.jdbcTargets = Input.ofNullable(jdbcTargets);
            return this;
        }

        public Builder lineageConfiguration(@Nullable Input<CrawlerLineageConfigurationGetArgs> lineageConfiguration) {
            this.lineageConfiguration = lineageConfiguration;
            return this;
        }

        public Builder lineageConfiguration(@Nullable CrawlerLineageConfigurationGetArgs lineageConfiguration) {
            this.lineageConfiguration = Input.ofNullable(lineageConfiguration);
            return this;
        }

        public Builder mongodbTargets(@Nullable Input<List<CrawlerMongodbTargetGetArgs>> mongodbTargets) {
            this.mongodbTargets = mongodbTargets;
            return this;
        }

        public Builder mongodbTargets(@Nullable List<CrawlerMongodbTargetGetArgs> mongodbTargets) {
            this.mongodbTargets = Input.ofNullable(mongodbTargets);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder recrawlPolicy(@Nullable Input<CrawlerRecrawlPolicyGetArgs> recrawlPolicy) {
            this.recrawlPolicy = recrawlPolicy;
            return this;
        }

        public Builder recrawlPolicy(@Nullable CrawlerRecrawlPolicyGetArgs recrawlPolicy) {
            this.recrawlPolicy = Input.ofNullable(recrawlPolicy);
            return this;
        }

        public Builder role(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder s3Targets(@Nullable Input<List<CrawlerS3TargetGetArgs>> s3Targets) {
            this.s3Targets = s3Targets;
            return this;
        }

        public Builder s3Targets(@Nullable List<CrawlerS3TargetGetArgs> s3Targets) {
            this.s3Targets = Input.ofNullable(s3Targets);
            return this;
        }

        public Builder schedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder schemaChangePolicy(@Nullable Input<CrawlerSchemaChangePolicyGetArgs> schemaChangePolicy) {
            this.schemaChangePolicy = schemaChangePolicy;
            return this;
        }

        public Builder schemaChangePolicy(@Nullable CrawlerSchemaChangePolicyGetArgs schemaChangePolicy) {
            this.schemaChangePolicy = Input.ofNullable(schemaChangePolicy);
            return this;
        }

        public Builder securityConfiguration(@Nullable Input<String> securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder securityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = Input.ofNullable(securityConfiguration);
            return this;
        }

        public Builder tablePrefix(@Nullable Input<String> tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }

        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = Input.ofNullable(tablePrefix);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public CrawlerState build() {
            return new CrawlerState(arn, catalogTargets, classifiers, configuration, databaseName, deltaTargets, description, dynamodbTargets, jdbcTargets, lineageConfiguration, mongodbTargets, name, recrawlPolicy, role, s3Targets, schedule, schemaChangePolicy, securityConfiguration, tablePrefix, tags, tagsAll);
        }
    }
}
