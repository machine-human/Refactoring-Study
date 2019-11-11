# CHAPTER 10 메서드 호출 단순화

객체에서 가장 중요한 것은 인터페이스이다.

이해와 사용이 쉬운 인터에피스를 작성하는 기술이야 말로 좋은 객체지향 소프트웨어 개발에 꼭 필요하다.

</br>

# 리팩토링 기법

- 아래 목록 클릭시 정리된 md 파일로 이동되며 전체 소스는 chapter10 패키지에 포함되어 있습니다.
- [메서드명 변경 - Rename Method](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/renamemethod/%EB%A9%94%EC%84%9C%EB%93%9C%EB%AA%85%20%EB%B3%80%EA%B2%BD.md)
- [매개변수 추가 - Add Parameter](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/addparameter/%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%20%EC%B6%94%EA%B0%80.md)
- [매개변수 제거 - Remove Paramter](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/removeparamter/%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%20%EC%A0%9C%EA%B1%B0.md)
- [상태 변경 메서드와 값 반환 메서드를 분리 - Separate Query from Modifier](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/separatequeryfrommodifier/%EC%83%81%ED%83%9C%20%EB%B3%80%EA%B2%BD%20%EB%A9%94%EC%84%9C%EB%93%9C%EC%99%80%20%EA%B0%92%20%EB%B0%98%ED%99%98%20%EB%A9%94%EC%84%9C%EB%93%9C%EB%A5%BC%20%EB%B6%84%EB%A6%AC.md)
- [메서드를 매개변수로 전환 - Parameterize Method](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/parameterizemethod/%EB%A9%94%EC%84%9C%EB%93%9C%EB%A5%BC%20%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%EB%A1%9C%20%EC%A0%84%ED%99%98.md)
- [매개변수를 메서드로 전환 - Replace Parameter with Explicit Methods](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/replaceparameterwithexplicitmethods/%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%EB%A5%BC%20%EB%A9%94%EC%84%9C%EB%93%9C%EB%A1%9C%20%EC%A0%84%ED%99%98.md)
- [객체를 통째로 전달 - Preserve Whole Object](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/preservewholeobject/%EA%B0%9D%EC%B2%B4%EB%A5%BC%20%ED%86%B5%EC%A7%B8%EB%A1%9C%20%EC%A0%84%EB%8B%AC.md)
- [매개변수 세트를 메서드로 전환 - Replace Parameter with Method](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/replaceparameterwithmethod/%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%20%EC%84%B8%ED%8A%B8%EB%A5%BC%20%EB%A9%94%EC%84%9C%EB%93%9C%EB%A1%9C%20%EC%A0%84%ED%99%98.md)
- [매개변수 세트를 객체로 전환 - Introdue Paramter Object](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/introdueparamterobject/%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%20%EC%84%B8%ED%8A%B8%EB%A5%BC%20%EA%B0%9D%EC%B2%B4%EB%A1%9C%20%EC%A0%84%ED%99%98.md)
- [쓰기 메서드 제거 - Remove Setting Method](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/removesettingmethod/%EC%93%B0%EA%B8%B0%20%EB%A9%94%EC%84%9C%EB%93%9C%20%EC%A0%9C%EA%B1%B0.md)
- [메서드 은폐 - Hide Method](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/hidemethod/%EB%A9%94%EC%84%9C%EB%93%9C%20%EC%9D%80%ED%8F%90.md)
- [새성자를 팩토리 메서드로 전환 - Replace Constructor with Factory Method](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/replaceconstructorwithfactorymethod/%EC%83%9D%EC%84%B1%EC%9E%90%EB%A5%BC%20%ED%8C%A9%ED%86%A0%EB%A6%AC%20%EB%A9%94%EC%84%9C%EB%93%9C%EB%A1%9C%20%EC%A0%84%ED%99%98.md)
- [하향 타입 변환을 캡슐화 - Encapsulate Downcast](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/encapsulatedowncast/%ED%95%98%ED%96%A5%20%ED%83%80%EC%9E%85%20%EB%B3%80%ED%99%98%EC%9D%84%20%EC%BA%A1%EC%8A%90%ED%99%94.md)
- [에러 부호를 예외 통지로 교체 - Replace Error Code with Exception](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/replaceerrorcodewithexception/%EC%97%90%EB%9F%AC%20%EB%B6%80%ED%98%B8%EB%A5%BC%20%EC%98%88%EC%99%B8%20%ED%86%B5%EC%A7%80%EB%A1%9C%20%EA%B5%90%EC%B2%B4.md)
- [예외 처리를 테스트로 교체 - Replace Exception with Test](https://github.com/machine-human/Refactoring-Study/blob/chapter-10/src/com/chapter10/replaceexceptionwithtest/%EC%98%88%EC%99%B8%20%EC%B2%98%EB%A6%AC%EB%A5%BC%20%ED%85%8C%EC%8A%A4%ED%8A%B8%EB%A1%9C%20%EA%B5%90%EC%B2%B4.md)
