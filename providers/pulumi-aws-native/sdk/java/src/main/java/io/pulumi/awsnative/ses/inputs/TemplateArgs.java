// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The content of the email, composed of a subject line, an HTML part, and a text-only part
 * 
 */
public final class TemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    /**
     * The HTML body of the email.
     * 
     */
    @Import(name="htmlPart")
      private final @Nullable Output<String> htmlPart;

    public Output<String> getHtmlPart() {
        return this.htmlPart == null ? Codegen.empty() : this.htmlPart;
    }

    /**
     * The subject line of the email.
     * 
     */
    @Import(name="subjectPart", required=true)
      private final Output<String> subjectPart;

    public Output<String> getSubjectPart() {
        return this.subjectPart;
    }

    /**
     * The name of the template.
     * 
     */
    @Import(name="templateName")
      private final @Nullable Output<String> templateName;

    public Output<String> getTemplateName() {
        return this.templateName == null ? Codegen.empty() : this.templateName;
    }

    /**
     * The email body that is visible to recipients whose email clients do not display HTML content.
     * 
     */
    @Import(name="textPart")
      private final @Nullable Output<String> textPart;

    public Output<String> getTextPart() {
        return this.textPart == null ? Codegen.empty() : this.textPart;
    }

    public TemplateArgs(
        @Nullable Output<String> htmlPart,
        Output<String> subjectPart,
        @Nullable Output<String> templateName,
        @Nullable Output<String> textPart) {
        this.htmlPart = htmlPart;
        this.subjectPart = Objects.requireNonNull(subjectPart, "expected parameter 'subjectPart' to be non-null");
        this.templateName = templateName;
        this.textPart = textPart;
    }

    private TemplateArgs() {
        this.htmlPart = Codegen.empty();
        this.subjectPart = Codegen.empty();
        this.templateName = Codegen.empty();
        this.textPart = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> htmlPart;
        private Output<String> subjectPart;
        private @Nullable Output<String> templateName;
        private @Nullable Output<String> textPart;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.htmlPart = defaults.htmlPart;
    	      this.subjectPart = defaults.subjectPart;
    	      this.templateName = defaults.templateName;
    	      this.textPart = defaults.textPart;
        }

        public Builder htmlPart(@Nullable Output<String> htmlPart) {
            this.htmlPart = htmlPart;
            return this;
        }
        public Builder htmlPart(@Nullable String htmlPart) {
            this.htmlPart = Codegen.ofNullable(htmlPart);
            return this;
        }
        public Builder subjectPart(Output<String> subjectPart) {
            this.subjectPart = Objects.requireNonNull(subjectPart);
            return this;
        }
        public Builder subjectPart(String subjectPart) {
            this.subjectPart = Output.of(Objects.requireNonNull(subjectPart));
            return this;
        }
        public Builder templateName(@Nullable Output<String> templateName) {
            this.templateName = templateName;
            return this;
        }
        public Builder templateName(@Nullable String templateName) {
            this.templateName = Codegen.ofNullable(templateName);
            return this;
        }
        public Builder textPart(@Nullable Output<String> textPart) {
            this.textPart = textPart;
            return this;
        }
        public Builder textPart(@Nullable String textPart) {
            this.textPart = Codegen.ofNullable(textPart);
            return this;
        }        public TemplateArgs build() {
            return new TemplateArgs(htmlPart, subjectPart, templateName, textPart);
        }
    }
}
