# itay-braha-help
Help for [**Itay Braha**](https://stackoverflow.com/questions/54562094/best-practice-to-convert-screen-design-to-xml-in-android?noredirect=1#comment95931127_54562094)</br>



So, I create for you quick **demo** app(_it is not as good as for commerce practice_). How it looks and works from inside you may see here in GitHub repo.

**Things you try to avoid:**

1. hardcoded text & colors in XML
2. not consistent id-naming
3. none-dimensional code \*, for example like this -  `android:textSize="16sp"`</br>
\* - I mean use `dimens.xml`, for instance - `android:textSize="@dimen/default_input_text_size"`

I will recommend you read a great book:

> Clean Code - Robert Martin

Also, I support @FrancislainyCampos post. You should try to read also about [design](https://material.io/design/) and [develop tools](https://material.io/develop/android/) to think and do more consistently with Google recommendations.
